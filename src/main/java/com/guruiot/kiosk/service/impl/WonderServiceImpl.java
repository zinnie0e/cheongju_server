package com.guruiot.kiosk.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.guruiot.kiosk.service.WonderService;
import com.guruiot.kiosk.mapper.WonderMapper;
import com.guruiot.kiosk.vo.WonderVO;

@Service
public class WonderServiceImpl implements WonderService{
	@Resource
	private WonderMapper WonderDAO;
	
	@Override
	public List<WonderVO> selWonderList(WonderVO params) throws Exception {
		return WonderDAO.selWonderList(params);
	}
}
