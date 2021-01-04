package com.guruiot.kiosk.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guruiot.kiosk.service.AccountService;
import com.guruiot.kiosk.service.IndustryService;
import com.guruiot.kiosk.vo.AccountVO;
import com.guruiot.kiosk.vo.IndustryVO;

@CrossOrigin(origins = "*")
@RestController
public class IndustryController {
	@Resource
	private IndustryService IndustrySVC;
	
	@RequestMapping(value = "/industry/select_industry_list", method = RequestMethod.POST)
	public List<IndustryVO> selAccountingSlip1(@RequestBody IndustryVO params) throws Exception {
		return IndustrySVC.selIndustryList(params);
	}	
	
}
