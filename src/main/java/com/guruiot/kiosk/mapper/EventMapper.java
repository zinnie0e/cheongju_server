package com.guruiot.kiosk.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guruiot.kiosk.vo.EventVO;

@Mapper
public interface EventMapper {
	public List<EventVO> selEvent(EventVO params) throws Exception;
	public List<EventVO> selEventDetail(EventVO params) throws Exception;
}
