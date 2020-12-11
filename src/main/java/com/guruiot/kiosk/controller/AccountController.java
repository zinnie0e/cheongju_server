package com.guruiot.kiosk.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guruiot.kiosk.service.AccountService;
import com.guruiot.kiosk.vo.AccountVO;

@CrossOrigin(origins = "http://192.168.1.76:8088")
@RestController
public class AccountController {
	@Resource
	private AccountService accountSVC;

	@RequestMapping(value="/account", method=RequestMethod.GET)
	public List<AccountVO> selectAll() throws Exception {		
		return accountSVC.getSelectAll();
	}
	
	@RequestMapping(value="/account/max", method=RequestMethod.GET)
	public int selectMax() throws Exception {
		return accountSVC.getSelectMax();
	}
	
	@RequestMapping(value="/account/user", method=RequestMethod.POST)
	public AccountVO selectUser(@RequestBody AccountVO params) throws Exception {
		return accountSVC.getSelectUser(params);
	}
	
	@RequestMapping(value="/account/insert", method=RequestMethod.POST)
	public boolean insert(@RequestBody AccountVO params) throws Exception {
		return accountSVC.setInsert(params);
	}
	
	@RequestMapping(value="/account/insert/sample", method=RequestMethod.GET)
	public boolean insertSample() throws Exception {
		AccountVO accountvo = new AccountVO();
		accountvo.setId("test1");
		accountvo.setPw("test12");
		accountvo.setName("test123");
		accountvo.setGrant(1);
		accountvo.setState(1);
		
		return accountSVC.setInsert(accountvo);
	}
	
	@RequestMapping(value="/account/update", method=RequestMethod.POST)
	public boolean update(@RequestBody AccountVO params) throws Exception {
		return accountSVC.setUpdate(params);
	}
	
	@RequestMapping(value="/account/delete", method=RequestMethod.POST)
	public boolean delete(@RequestBody AccountVO params) throws Exception {
		return accountSVC.setDelete(params);
	}
}
