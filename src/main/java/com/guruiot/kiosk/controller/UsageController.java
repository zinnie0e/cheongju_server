package com.guruiot.kiosk.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guruiot.kiosk.service.UsageService;
import com.guruiot.kiosk.vo.NetworkVO;
import com.guruiot.kiosk.vo.UsageVO;

@CrossOrigin(origins = "*")
@RestController
public class UsageController {
	@Resource
	private UsageService usageSVC;
	
	@RequestMapping(value="/usage/select_all_count_usage", method=RequestMethod.POST)
	public UsageVO selAllCountUsage() throws Exception {
		return usageSVC.selAllCountUsage();
	}
	
	@RequestMapping(value="/usage/select_all_usage", method=RequestMethod.POST)
	public List<UsageVO> selAllUsage() throws Exception {
		return usageSVC.selAllUsage();
	}
	
	@RequestMapping(value="/usage/select_day_usage", method=RequestMethod.POST)
	public UsageVO selUsage(@RequestBody UsageVO params) throws Exception {
		return usageSVC.selUsage(params);
	}
	
	@RequestMapping(value="/usage/select_usage_day_list", method=RequestMethod.POST)
	public List<UsageVO> selUsageDayList(@RequestBody UsageVO params) throws Exception {
		return usageSVC.selUsageDayList(params);
	}
	
	@RequestMapping(value="/usage/update_usage", method=RequestMethod.POST)
	public boolean upUsage(@RequestBody UsageVO params) throws Exception {
		UsageVO date_params = new UsageVO();
		date_params.setDate(params.getDate());
		
		UsageVO origin_list = usageSVC.selUsage(date_params);
		
		if(origin_list == null) usageSVC.inUsage(date_params);
		else {
			params.setEvent_cnt(params.getEvent_cnt() + origin_list.getEvent_cnt());
			params.setIndustry_cnt(params.getIndustry_cnt() + origin_list.getIndustry_cnt());
			params.setWonder_cnt(params.getWonder_cnt() + origin_list.getWonder_cnt());
			params.setCraft_cnt(params.getCraft_cnt() + origin_list.getCraft_cnt());
			params.setLibrary_cnt(params.getLibrary_cnt() + origin_list.getLibrary_cnt());
			params.setMedia_cnt(params.getMedia_cnt() + origin_list.getMedia_cnt());
			params.setFoundation_cnt(params.getFoundation_cnt() + origin_list.getFoundation_cnt());
			params.setMuseum_cnt(params.getMuseum_cnt() + origin_list.getMuseum_cnt());
			params.setDongbu_cnt(params.getDongbu_cnt() + origin_list.getDongbu_cnt());
			params.setParking_cnt(params.getParking_cnt() + origin_list.getParking_cnt());
			params.setHours_cnt(params.getHours_cnt() + origin_list.getHours_cnt());
		}
		return usageSVC.upUsage(params);
	}
}
