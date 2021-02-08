package com.guruiot.kiosk.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guruiot.kiosk.service.UsageService;
import com.guruiot.kiosk.mapper.UsageMapper;
import com.guruiot.kiosk.vo.UsageVO;

@Service
public class UsageServiceImpl implements UsageService{
	@Resource
	private UsageMapper usageDAO;
	
	@Override
	public UsageVO selAllCountUsage() throws Exception {
		return usageDAO.selAllCountUsage();
	}
	
	@Override
	public List<UsageVO> selAllUsage() throws Exception {
		return usageDAO.selAllUsage();
	}
	
	@Override
	public UsageVO selUsage(UsageVO params) throws Exception {
		return usageDAO.selUsage(params);
	}
	
	@Override
	public List<UsageVO> selUsageDayList(UsageVO params) throws Exception {
		return usageDAO.selUsageDayList(params);
	}
	
	@Override
	public boolean inUsage(UsageVO params) throws Exception {
		int quest_result = usageDAO.inUsage(params);
		return (quest_result == 1) ? true : false;
	}
	
	@Override
	public boolean upUsage(UsageVO params) throws Exception {
		int quest_result = usageDAO.upUsage(params);
		return (quest_result == 1) ? true : false;
	}
}
