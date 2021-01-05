package com.guruiot.kiosk.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guruiot.kiosk.vo.NoticeVO;

@Mapper
public interface NoticeMapper {
	public List<NoticeVO> selNotice(NoticeVO params) throws Exception;
}
