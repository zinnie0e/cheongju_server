package com.guruiot.kiosk.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.guruiot.kiosk.service.IndustryService;
import com.guruiot.kiosk.mapper.IndustryMapper;
import com.guruiot.kiosk.vo.EventVO;
import com.guruiot.kiosk.vo.IndustryVO;

@Service
public class IndustryServiceImpl implements IndustryService{
	@Resource
	private IndustryMapper industryDAO;
	
	@Override
	public List<IndustryVO> selIndustryList(IndustryVO params) throws Exception {
		return industryDAO.selIndustryList(params);
	}
	@Override
	public List<IndustryVO> selIndustryList2(IndustryVO params) throws Exception {
		return industryDAO.selIndustryList2(params);
	}
	
	@Override
	public List<IndustryVO> selIndustry() throws Exception {
		return industryDAO.selIndustry();
	}
	@Override
	public List<IndustryVO> selIndustrySearch(IndustryVO params) throws Exception {
		return industryDAO.selIndustrySearch(params);
	}
	@Override
	public List<IndustryVO> selIndustryAllLang(IndustryVO params) throws Exception {
		return industryDAO.selIndustryAllLang(params);
	}
	@Override
	public int selIndustryMaxUid() throws Exception {
		Integer get_param = industryDAO.selIndustryMaxUid();
		int max_uid = 0;
		if(get_param != null) {
			max_uid = get_param;
		}
		return max_uid;
	}

	@Override
	public boolean inIndustry(IndustryVO params) throws Exception {
		int quest_result = industryDAO.inIndustry(params);
		return (quest_result == 1) ? true : false;
	}
	@Override
	public boolean upIndustry(IndustryVO params) throws Exception {
		int quest_result = industryDAO.upIndustry(params);
		return (quest_result == 1) ? true : false;
	}
	@Override
	public boolean delIndustry(IndustryVO params) throws Exception {
		int quest_result = industryDAO.delIndustry(params);
		return (quest_result == 1) ? true : false;
	}
}
