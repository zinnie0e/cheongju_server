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

}
