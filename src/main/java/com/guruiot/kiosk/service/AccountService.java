package com.guruiot.kiosk.service;

import java.util.List;
import com.guruiot.kiosk.vo.AccountVO;

public interface AccountService {
	List<AccountVO> getSelectAll() throws Exception;
	int getSelectMax() throws Exception;
	AccountVO getSelectUser(AccountVO params) throws Exception;
	
	boolean setInsert(AccountVO params) throws Exception;
	boolean setUpdate(AccountVO params) throws Exception;
	boolean setDelete(AccountVO params) throws Exception;
}
