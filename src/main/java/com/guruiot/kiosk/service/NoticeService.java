package com.guruiot.kiosk.service;

import java.util.List;

import com.guruiot.kiosk.vo.NoticeVO;

public interface NoticeService {
	List<NoticeVO> selNotice(NoticeVO params) throws Exception;
	
	List<NoticeVO> selNoticeCount() throws Exception;
	List<NoticeVO> selNoticeOfLang(NoticeVO params) throws Exception;
	
	boolean inNoticeOfLang(NoticeVO params) throws Exception;
	boolean upNoticeOfLang(NoticeVO params) throws Exception;
	boolean delNoticeOfLang(NoticeVO params) throws Exception;
}
