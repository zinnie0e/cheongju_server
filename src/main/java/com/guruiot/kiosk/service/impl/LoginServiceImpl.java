package com.guruiot.kiosk.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guruiot.kiosk.mapper.AccountMapper;
import com.guruiot.kiosk.service.LoginService;
import com.guruiot.kiosk.vo.AccountVO;
import com.guruiot.kiosk.vo.LoginVO;

@Service
public class LoginServiceImpl implements LoginService{
	@Resource
	private AccountMapper accountDAO;

	@Override
	public AccountVO getSelectUser(LoginVO params) throws Exception {
		AccountVO accountVO = new AccountVO();
		accountVO.setId(params.getId());
		accountVO.setPw(params.getPw());
		
		return accountDAO.selectUser(accountVO);
	}
}
