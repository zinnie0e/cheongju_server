package com.guruiot.kiosk.service;

import java.util.List;
import com.guruiot.kiosk.vo.UserVO;

public interface UserService {
	
	int selCheckUser(UserVO params) throws Exception;
	List<UserVO> selUser(UserVO params) throws Exception;
	List<UserVO> selAllUser() throws Exception;
	
	boolean inUser(UserVO params) throws Exception;
	boolean upUser(UserVO params) throws Exception;
	boolean delUser(UserVO params) throws Exception;
}
