package com.guruiot.kiosk.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guruiot.kiosk.service.NetworkService;
import com.guruiot.kiosk.mapper.NetworkMapper;
import com.guruiot.kiosk.vo.NetworkVO;

@Service
public class NetworkServiceImpl implements NetworkService{
	@Resource
	private NetworkMapper networkDAO;
	
	@Override
	public int selNetworkCount() throws Exception {
		return networkDAO.selNetworkCount();
	}
	
	@Override
	public List<NetworkVO> selAllNetwork() throws Exception {
		return networkDAO.selAllNetwork();
	}
	
	@Override
	public boolean inNetwork(NetworkVO params) throws Exception {
		int quest_result = networkDAO.inNetwork(params);
		return (quest_result == 1) ? true : false;
	}
	
	@Override
	public boolean delNetwork() throws Exception {
		int quest_result = networkDAO.delNetwork();
		return (quest_result == 1) ? true : false;
	}
}
