package com.guruiot.kiosk.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.guruiot.kiosk.service.EventService;
import com.guruiot.kiosk.mapper.EventMapper;
import com.guruiot.kiosk.vo.EventVO;

@Service
public class EventServiceImpl implements EventService{
	@Resource
	private EventMapper eventDAO;
	
	@Override 
	public List<EventVO> selEvent(EventVO params) throws Exception { 
		return eventDAO.selEvent(params); 
	}
	@Override 
	public List<EventVO> selEventDetail(EventVO params) throws Exception { 
		return eventDAO.selEventDetail(params); 
	}

}
