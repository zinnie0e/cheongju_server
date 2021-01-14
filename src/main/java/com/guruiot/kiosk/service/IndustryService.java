package com.guruiot.kiosk.service;

import java.util.List;

import com.guruiot.kiosk.vo.IndustryVO;

public interface IndustryService {
	List<IndustryVO> selIndustryList(IndustryVO params) throws Exception;
	List<IndustryVO> selIndustryList2(IndustryVO params) throws Exception;
	
	List<IndustryVO> selIndustry() throws Exception;
	List<IndustryVO> selIndustrySearch(IndustryVO params) throws Exception;
	List<IndustryVO> selIndustryAllLang(IndustryVO params) throws Exception;
	int selIndustryMaxUid() throws Exception;
	
	boolean inIndustry(IndustryVO params) throws Exception;
	boolean upIndustry(IndustryVO params) throws Exception;
	boolean delIndustry(IndustryVO params) throws Exception;
}
