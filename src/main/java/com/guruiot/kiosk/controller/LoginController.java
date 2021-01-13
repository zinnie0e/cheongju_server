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
import com.guruiot.kiosk.service.UserService;
import com.guruiot.kiosk.vo.UserVO;

@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
@RestController
public class LoginController {
	@Resource
	private UserService userSVC;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public UserVO login(@RequestBody UserVO params, HttpServletRequest request) throws Exception {
		UserVO result_param = new UserVO();
		
		String result = "success";
		
		List<UserVO> get_params = userSVC.selUser(params);
		
		try {
			if(get_params != null && get_params.size() > 0) {
				UserVO get_param = get_params.get(0);
				
				String user_id = get_param.getUser_id();
				String user_pw = get_param.getUser_pw();
				
				if(user_pw.equals(params.getUser_pw())) {
					SessionListener.getInstance().printloginUsers();
					if(SessionListener.getInstance().isUsing(user_id)) {
						SessionListener.getInstance().removeSession(user_id);
						
						result ="re-login";
					}
					
					HttpSession session = request.getSession(true);
					
					session.setMaxInactiveInterval(30*60);
					session.setAttribute("JSESSIONID", request.getSession().getId());
					
					SessionListener.getInstance().setSession(session, user_id);
					
					result_param = get_param;
				} else {
					result = "pwd";
				}
			} else {
				result = "none";
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			result = "error";
		}
		
		result_param.setResult(result);
		return result_param;
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
