package com.guruiot.kiosk.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.guruiot.kiosk.service.NoticeService;
import com.guruiot.kiosk.mapper.NoticeMapper;
import com.guruiot.kiosk.vo.NoticeVO;

@Service
public class NoticeServiceImpl implements NoticeService{
	@Resource
	private NoticeMapper noticeDAO;
	
	@Override 
	public List<NoticeVO> selNotice(NoticeVO params) throws Exception { 
		return noticeDAO.selNotice(params); 
	}
	
	@Override
	public List<NoticeVO> selNoticeCount() throws Exception {
		return noticeDAO.selNoticeCount(); 
	}
	@Override 
	public List<NoticeVO> selNoticeOfLang(NoticeVO params) throws Exception { 
		return noticeDAO.selNoticeOfLang(params); 
	}
	
	@Override
	public boolean inNoticeOfLang(NoticeVO params) throws Exception {
		int quest_result = noticeDAO.inNoticeOfLang(params);
		return (quest_result == 1) ? true : false;
	}
	@Override
	public boolean upNoticeOfLang(NoticeVO params) throws Exception {
		int quest_result = noticeDAO.upNoticeOfLang(params);
		return (quest_result == 1) ? true : false;
	}
	@Override
	public boolean delNoticeOfLang(NoticeVO params) throws Exception {
		int quest_result = noticeDAO.delNoticeOfLang(params);
		return (quest_result == 1) ? true : false;
	}
}
