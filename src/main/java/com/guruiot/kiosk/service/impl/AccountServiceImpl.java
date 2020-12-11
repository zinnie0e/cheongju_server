package com.guruiot.kiosk.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.guruiot.kiosk.service.AccountService;
import com.guruiot.kiosk.mapper.AccountMapper;
import com.guruiot.kiosk.vo.AccountVO;

@Service
public class AccountServiceImpl implements AccountService{
	@Resource
	private AccountMapper accountDAO;
	
	@Override
	public List<AccountVO> getSelectAll() throws Exception {
		return accountDAO.selectAll();
	}
	
	@Override
	public int getSelectMax() throws Exception {
		Integer get_param = accountDAO.selectMax();
		int max = 0;
		if(get_param != null) {
			max = get_param;
		}
		return max;
	}
	
	@Override
	public AccountVO getSelectUser(AccountVO params) throws Exception {
		return accountDAO.selectUser(params);
	}
	
	@Override
	public boolean setInsert(AccountVO params) throws Exception {
		int quest_result = accountDAO.insert(params);
		return (quest_result == 1) ? true : false;
	}
	
	@Override
	public boolean setUpdate(AccountVO params) throws Exception {
		int quest_result = accountDAO.update(params);
		return (quest_result == 1) ? true : false;
	}
	
	@Override
	public boolean setDelete(AccountVO params) throws Exception {
		int quest_result = accountDAO.delete(params);
		return (quest_result == 1) ? true : false;
	}
}
