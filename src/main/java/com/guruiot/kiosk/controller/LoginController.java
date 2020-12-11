package com.guruiot.kiosk.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guruiot.kiosk.SessionListener;
import com.guruiot.kiosk.service.LoginService;
import com.guruiot.kiosk.vo.AccountVO;
import com.guruiot.kiosk.vo.LoginVO;

@CrossOrigin(origins = "http://192.168.1.76:8088", allowCredentials = "true")
@RestController
public class LoginController {
	@Resource
	private LoginService loginSVC;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public LoginVO login(@RequestBody LoginVO params, HttpServletRequest request) throws Exception {
		LoginVO loginVO = new LoginVO();
		
		String result = "success";
		
		AccountVO get_param = loginSVC.getSelectUser(params);
		
		try {
			if(get_param != null) {
				String user_id = get_param.getId();
				String user_pw = get_param.getPw();
				
				if(user_pw.equals(params.getPw())) {
					SessionListener.getInstance().printloginUsers();
					if(SessionListener.getInstance().isUsing(user_id)) {
						SessionListener.getInstance().removeSession(user_id);
						
						result ="re-login";
					}
					
					HttpSession session = request.getSession(true);
					
					session.setMaxInactiveInterval(30*60);
					session.setAttribute("JSESSIONID", request.getSession().getId());
					
					SessionListener.getInstance().setSession(session, user_id);
				} else {
					result = "fail";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			result = "error";
		}
		
		loginVO.setResult(result);
		return loginVO;
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.POST)
	public void logout(HttpServletRequest request) throws Exception {
		String user_id = SessionListener.getInstance().getUserID(request.getSession());
		
		SessionListener.getInstance().printloginUsers();
		
		if(user_id != null) {
			if(SessionListener.getInstance().isUsing(user_id)) {
				SessionListener.getInstance().removeSession(user_id);
			}
		}
	}
	
	@RequestMapping(value="/check", method=RequestMethod.POST)
	public String check(HttpServletRequest request) throws Exception {
		System.out.println(request.getHeader("Cookie") + "/" + request.getSession().getId());
		
		String user_id = SessionListener.getInstance().getUserID(request.getSession());
		
		SessionListener.getInstance().printloginUsers();
		if(user_id != null) {
			if(SessionListener.getInstance().isUsing(user_id)) {
				return "pass";
			} else {
				return "fail";
			}
		}
		
		return "empty";
	}
}
