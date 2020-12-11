package com.guruiot.kiosk.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.guruiot.kiosk.vo.AccountVO;

@Mapper
public interface AccountMapper {
	public List<AccountVO> selectAll() throws Exception;
	public Integer selectMax() throws Exception;
	public AccountVO selectUser(AccountVO params) throws Exception;
	
	public int insert(AccountVO params) throws Exception;
	public int update(AccountVO params) throws Exception;
	public int delete(AccountVO params) throws Exception;
}
