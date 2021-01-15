package com.guruiot.kiosk.service;

import java.util.List;

import com.guruiot.kiosk.vo.EventVO;

public interface EventService {
	List<EventVO> selEvent(EventVO params) throws Exception;
	List<EventVO> selEventOfFound(EventVO params) throws Exception;
	List<EventVO> selEventDetail(EventVO params) throws Exception;
	List<EventVO> selEventAllLang(EventVO params) throws Exception;
	int selEventMaxUid() throws Exception;
	int selEventMaxCount(EventVO params) throws Exception;
	List<EventVO> selEventPoster() throws Exception;
	
	boolean inEvent(EventVO params) throws Exception;
	boolean inEventDetail(EventVO params) throws Exception;
	boolean upEvent(EventVO params) throws Exception;
	boolean upEventDetail(EventVO params) throws Exception;
	boolean delEvent(EventVO params) throws Exception;
	boolean delEventDetail(EventVO params) throws Exception;
}