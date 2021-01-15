package com.guruiot.kiosk.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guruiot.kiosk.vo.EventVO;

@Mapper
public interface EventMapper {
	public List<EventVO> selEvent(EventVO params) throws Exception;
	public List<EventVO> selEventOfFound(EventVO params) throws Exception;
	public List<EventVO> selEventDetail(EventVO params) throws Exception;
	public List<EventVO> selEventAllLang(EventVO params) throws Exception;
	public Integer selEventMaxUid() throws Exception;
	public Integer selEventMaxCount(EventVO params) throws Exception;
	public List<EventVO> selEventPoster() throws Exception;
	
	public int inEvent(EventVO params) throws Exception;
	public int inEventDetail(EventVO params) throws Exception;
	public int upEvent(EventVO params) throws Exception;
	public int upEventDetail(EventVO params) throws Exception;
	public int delEvent(EventVO params) throws Exception;
	public int delEventDetail(EventVO params) throws Exception;
}
