package com.guruiot.kiosk.service;

import java.util.List;

import com.guruiot.kiosk.vo.EventVO;

public interface EventService {
	List<EventVO> selEvent(EventVO params) throws Exception;
	List<EventVO> selEventDetail(EventVO params) throws Exception;
}
