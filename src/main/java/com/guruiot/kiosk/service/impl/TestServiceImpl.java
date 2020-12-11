package com.guruiot.kiosk.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.guruiot.kiosk.service.TestService;
import com.guruiot.kiosk.mapper.TestMapper;
import com.guruiot.kiosk.vo.TestVO;

@Service
public class TestServiceImpl implements TestService{
	@Resource
	private TestMapper testDAO;
	
	@Override
	public List<TestVO> getTestMultiSelectAll() throws Exception {
		return testDAO.testMultiSelectAll();
	}
	
	@Override
	public List<TestVO> getTestSelectAll() throws Exception {
		return testDAO.testSelectAll();
	}
	
	@Override
	public int getTestSelectMax() throws Exception {
		Integer get_param = testDAO.testSelectMax();
		int max = 0;
		if(get_param != null) {
			max = get_param;
		}
		return max;
	}
	
	@Override
	public boolean setTestInsert(TestVO params) throws Exception {
		int quest_result = testDAO.testInsert(params);
		return (quest_result == 1) ? true : false;
	}
	
	@Override
	public boolean setTestUpdateData(TestVO params) throws Exception {
		int quest_result = testDAO.testUpdateData(params);
		return (quest_result == 1) ? true : false;
	}
	
	@Override
	public boolean setTestDelete(TestVO params) throws Exception {
		int quest_result = testDAO.testDelete(params);
		return (quest_result == 1) ? true : false;
	}
}
