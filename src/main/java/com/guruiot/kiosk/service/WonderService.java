package com.guruiot.kiosk.service;

import java.util.List;
import com.guruiot.kiosk.vo.WonderVO;

public interface WonderService {
	
	List<WonderVO> selWonderList(WonderVO params) throws Exception;
}
