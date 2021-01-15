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
	public List<EventVO> selEventOfFound(EventVO params) throws Exception { 
		return eventDAO.selEventOfFound(params); 
	}
	@Override 
	public List<EventVO> selEventDetail(EventVO params) throws Exception { 
		return eventDAO.selEventDetail(params); 
	}
	@Override 
	public List<EventVO> selEventAllLang(EventVO params) throws Exception { 
		return eventDAO.selEventAllLang(params); 
	}
	
	@Override
	public int selEventMaxUid() throws Exception {
		Integer get_param = eventDAO.selEventMaxUid();
		int max_uid = 0;
		if(get_param != null) {
			max_uid = get_param;
		}
		return max_uid;
	}
	@Override
	public int selEventMaxCount(EventVO params) throws Exception {
		return eventDAO.selEventMaxCount(params);
	}
	
	@Override 
	public List<EventVO> selEventPoster() throws Exception { 
		return eventDAO.selEventPoster(); 
	}

	@Override
	public boolean inEvent(EventVO params) throws Exception {
		int quest_result = eventDAO.inEvent(params);
		return (quest_result == 1) ? true : false;
	}
	@Override
	public boolean inEventDetail(EventVO params) throws Exception {
		int quest_result = eventDAO.inEventDetail(params);
		return (quest_result == 1) ? true : false;
	}
	@Override
	public boolean upEvent(EventVO params) throws Exception {
		int quest_result = eventDAO.upEvent(params);
		return (quest_result == 1) ? true : false;
	}
	@Override
	public boolean upEventDetail(EventVO params) throws Exception {
		int quest_result = eventDAO.upEventDetail(params);
		return (quest_result == 1) ? true : false;
	}
	@Override
	public boolean delEvent(EventVO params) throws Exception {
		int quest_result = eventDAO.delEvent(params);
		return (quest_result == 1) ? true : false;
	}
	@Override
	public boolean delEventDetail(EventVO params) throws Exception {
		int quest_result = eventDAO.delEventDetail(params);
		return (quest_result == 1) ? true : false;
	}
}
