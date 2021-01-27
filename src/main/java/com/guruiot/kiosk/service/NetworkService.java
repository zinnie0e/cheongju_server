package com.guruiot.kiosk.service;

import java.util.List;
import com.guruiot.kiosk.vo.NetworkVO;

public interface NetworkService {
	
	List<NetworkVO> selAllNetwork() throws Exception;
	
	boolean inNetwork(NetworkVO params) throws Exception;
	boolean delNetwork() throws Exception;
}
