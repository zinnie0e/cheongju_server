package com.guruiot.kiosk.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guruiot.kiosk.service.UserService;
import com.guruiot.kiosk.mapper.UserMapper;
import com.guruiot.kiosk.vo.UserVO;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userDAO;
	
	@Override
	public int selCheckUser(UserVO params) throws Exception {
		Integer get_param = userDAO.selCheckUser(params);
		int count = 0;
		if(get_param != null) {
			count = get_param;
		}
		return count;
	}
	
	@Override
	public List<UserVO> selUser(UserVO params) throws Exception {
		return userDAO.selUser(params);
	}
	
	@Override
	public List<UserVO> selAllUser() throws Exception {
		return userDAO.selAllUser();
	}
	
	@Override
	public boolean inUser(UserVO params) throws Exception {
		int quest_result = userDAO.inUser(params);
		return (quest_result == 1) ? true : false;
	}
	
	@Override
	public boolean upUser(UserVO params) throws Exception {
		int quest_result = userDAO.upUser(params);
		return (quest_result == 1) ? true : false;
	}
	
	@Override
	public boolean delUser(UserVO params) throws Exception {
		int quest_result = userDAO.delUser(params);
		return (quest_result == 1) ? true : false;
	}
}
