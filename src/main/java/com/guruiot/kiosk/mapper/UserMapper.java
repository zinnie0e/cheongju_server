package com.guruiot.kiosk.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.guruiot.kiosk.vo.UserVO;

@Mapper
public interface UserMapper {
	
	public Integer selCheckUser(UserVO params) throws Exception;
	public List<UserVO> selUser(UserVO params) throws Exception;
	public List<UserVO> selAllUser() throws Exception;
	
	public int inUser(UserVO params) throws Exception;
	public int upUser(UserVO params) throws Exception;
	public int delUser(UserVO params) throws Exception;
}
