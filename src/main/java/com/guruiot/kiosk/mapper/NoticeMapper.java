package com.guruiot.kiosk.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guruiot.kiosk.vo.NoticeVO;

@Mapper
public interface NoticeMapper {
	public List<NoticeVO> selNotice(NoticeVO params) throws Exception;
	
	public List<NoticeVO> selNoticeCount() throws Exception;
	public List<NoticeVO> selNoticeOfLang(NoticeVO params) throws Exception;
	
	public int inNoticeOfLang(NoticeVO params) throws Exception;
	public int upNoticeOfLang(NoticeVO params) throws Exception;
	public int delNoticeOfLang(NoticeVO params) throws Exception;
}
