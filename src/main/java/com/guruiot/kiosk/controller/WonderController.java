package com.guruiot.kiosk.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guruiot.kiosk.service.WonderService;
import com.guruiot.kiosk.vo.WonderVO;

@CrossOrigin(origins = "*")
@RestController
public class WonderController {
	@Resource
	private WonderService WonderSVC;
	
	@RequestMapping(value = "/wonder/select_wonder_list", method = RequestMethod.POST)
	public List<WonderVO> selWonder(@RequestBody WonderVO params) throws Exception {
		return WonderSVC.selWonderList(params);
	}	
	
}
