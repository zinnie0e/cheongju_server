package com.guruiot.kiosk.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guruiot.kiosk.service.IndustryService;
import com.guruiot.kiosk.vo.EventVO;
import com.guruiot.kiosk.vo.IndustryVO;

@CrossOrigin(origins = "*")
@RestController
public class IndustryController {
	@Resource
	private IndustryService industrySVC;
	
	@RequestMapping(value = "/industry/select_industry_list", method = RequestMethod.POST)
	public List<IndustryVO> selAccountingSlip1(@RequestBody IndustryVO params) throws Exception {
		return industrySVC.selIndustryList(params);
	}	
	@RequestMapping(value = "/industry/select_industry_list2", method = RequestMethod.POST)
	public List<IndustryVO> selAccountingSlip2(@RequestBody IndustryVO params) throws Exception {
		return industrySVC.selIndustryList2(params);
	}	
	
	@RequestMapping(value = "/industry/select_industry", method = RequestMethod.POST)
	public List<IndustryVO> selIndustry() throws Exception {
		return industrySVC.selIndustry();
	}	
	@RequestMapping(value = "/industry/select_industry_search", method = RequestMethod.POST)
	public List<IndustryVO> selIndustrySearch(@RequestBody IndustryVO params) throws Exception {
		return industrySVC.selIndustrySearch(params);
	}	
	@RequestMapping(value = "/industry/select_industry_all_lang", method = RequestMethod.POST)
	public List<IndustryVO> selIndustryAllLang(@RequestBody IndustryVO params) throws Exception {
		return industrySVC.selIndustryAllLang(params);
	}	
	@RequestMapping(value="/industry/select_company_maxuid", method=RequestMethod.POST)
	public int selIndustryMaxUid() throws Exception {
		return industrySVC.selIndustryMaxUid();
	}
	
	@RequestMapping(value="/industry/insert_company", method=RequestMethod.POST)
	public boolean inIndustry(@RequestBody IndustryVO params) throws Exception {
		return industrySVC.inIndustry(params);
	}
	@RequestMapping(value="/industry/update_company", method=RequestMethod.POST)
	public boolean upIndustry(@RequestBody IndustryVO params) throws Exception {
		return industrySVC.upIndustry(params);
	}
	@RequestMapping(value="/industry/delete_company", method=RequestMethod.POST)
	public boolean delIndustry(@RequestBody IndustryVO params) throws Exception {
		return industrySVC.delIndustry(params);
	}
	
}
