package com.guruiot.kiosk.service;

import java.util.List;

import com.guruiot.kiosk.vo.NoticeVO;

public interface NoticeService {
	List<NoticeVO> selNotice(NoticeVO params) throws Exception;
}
