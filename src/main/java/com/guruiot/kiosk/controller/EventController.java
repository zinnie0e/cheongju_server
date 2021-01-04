package com.guruiot.kiosk.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guruiot.kiosk.service.EventService;
import com.guruiot.kiosk.vo.EventVO;

@CrossOrigin(origins = "*")
@RestController
public class EventController {
	@Resource
	private EventService eventSVC;

	@RequestMapping(value="/event/select_event_list", method=RequestMethod.POST) 
	public List<EventVO> selEvent(@RequestBody EventVO params) throws Exception { 
		return eventSVC.selEvent(params); 
	}
	@RequestMapping(value="/event/select_event_detail_list", method=RequestMethod.POST) 
	public List<EventVO> selEventDetail(@RequestBody EventVO params) throws Exception { 
		return eventSVC.selEventDetail(params); 
	}
}
