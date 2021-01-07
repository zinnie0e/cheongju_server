package com.guruiot.kiosk.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guruiot.kiosk.service.UserService;
import com.guruiot.kiosk.vo.UserVO;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
	@Resource
	private UserService userSVC;
	
	@RequestMapping(value="/user/select_check_user", method=RequestMethod.POST)
	public int selCheckUser(@RequestBody UserVO params) throws Exception {
		return userSVC.selCheckUser(params);
	}
	
	@RequestMapping(value="/user/select_user", method=RequestMethod.POST)
	public List<UserVO> selUser(@RequestBody UserVO params) throws Exception {
		return userSVC.selUser(params);
	}
	
	@RequestMapping(value="/user/select_all_user", method=RequestMethod.POST)
	public List<UserVO> selAllUser() throws Exception {		
		return userSVC.selAllUser();
	}
	
	@RequestMapping(value="/user/insert_user", method=RequestMethod.POST)
	public boolean inUser(@RequestBody UserVO params) throws Exception {
		return userSVC.inUser(params);
	}
	
	@RequestMapping(value="/user/update_user", method=RequestMethod.POST)
	public boolean upUser(@RequestBody UserVO params) throws Exception {
		return userSVC.upUser(params);
	}
	
	@RequestMapping(value="/user/delete_user", method=RequestMethod.POST)
	public boolean delUser(@RequestBody UserVO params) throws Exception {
		return userSVC.delUser(params);
	}
}
