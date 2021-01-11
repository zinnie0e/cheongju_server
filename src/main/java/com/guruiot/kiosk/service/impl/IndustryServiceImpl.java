package com.guruiot.kiosk.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.guruiot.kiosk.service.IndustryService;
import com.guruiot.kiosk.mapper.IndustryMapper;
import com.guruiot.kiosk.vo.IndustryVO;

@Service
public class IndustryServiceImpl implements IndustryService{
	@Resource
	private IndustryMapper IndustryDAO;
	
	@Override
	public List<IndustryVO> selIndustryList(IndustryVO params) throws Exception {
		return IndustryDAO.selIndustryList(params);
	}
	@Override
	public List<IndustryVO> selIndustryList2(IndustryVO params) throws Exception {
		return IndustryDAO.selIndustryList2(params);
	}
}
