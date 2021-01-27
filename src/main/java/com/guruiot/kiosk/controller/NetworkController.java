package com.guruiot.kiosk.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guruiot.kiosk.service.NetworkService;
import com.guruiot.kiosk.vo.NetworkVO;

@CrossOrigin(origins = "*")
@RestController
public class NetworkController {
	@Resource
	private NetworkService networkSVC;
	
	@RequestMapping(value="/network/select_all_network", method=RequestMethod.POST)
	public List<NetworkVO> selAllNetwork() throws Exception {
		
		return networkSVC.selAllNetwork();
	}
	
	@RequestMapping(value="/network/insert_network", method=RequestMethod.POST)
	public boolean inNetwork(@RequestBody NetworkVO params) throws Exception {
		networkSVC.delNetwork();
		return networkSVC.inNetwork(params);
	}
	
	@RequestMapping(value="/network/delete_network", method=RequestMethod.POST)
	public boolean delNetwork() throws Exception {
		return networkSVC.delNetwork();
	}
}
