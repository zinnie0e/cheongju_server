package com.guruiot.kiosk.service;

import java.util.List;

import com.guruiot.kiosk.vo.AccountVO;
import com.guruiot.kiosk.vo.LoginVO;

public interface LoginService {
	AccountVO getSelectUser(LoginVO params) throws Exception;
}
