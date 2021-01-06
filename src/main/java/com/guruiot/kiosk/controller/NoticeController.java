package com.guruiot.kiosk.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guruiot.kiosk.service.NoticeService;
import com.guruiot.kiosk.vo.NoticeVO;

@CrossOrigin(origins = "*")
@RestController
public class NoticeController {
	@Resource
	private NoticeService noticeSVC;

	@RequestMapping(value="/notice/select_notice", method=RequestMethod.POST) 
	public List<NoticeVO> selNotice(@RequestBody NoticeVO params) throws Exception { 
		return noticeSVC.selNotice(params); 
	}
	
	@RequestMapping(value="/notice/select_notice_count", method=RequestMethod.POST) 
	public List<NoticeVO> selNoticeCount() throws Exception { 
		return noticeSVC.selNoticeCount(); 
	}
	@RequestMapping(value="/notice/select_notice_of_lang", method=RequestMethod.POST) 
	public List<NoticeVO> selNoticeOfLang(@RequestBody NoticeVO params) throws Exception { 
		return noticeSVC.selNoticeOfLang(params); 
	}
	
	@RequestMapping(value="/notice/insert_notice_of_lang", method=RequestMethod.POST)
	public boolean inNoticeOfLang(@RequestBody NoticeVO params) throws Exception {
		return noticeSVC.inNoticeOfLang(params);
	}
	@RequestMapping(value="/notice/update_notice_of_lang", method=RequestMethod.POST)
	public boolean upNoticeOfLang(@RequestBody NoticeVO params) throws Exception {
		return noticeSVC.upNoticeOfLang(params);
	}
	@RequestMapping(value="/notice/delete_notice_of_lang", method=RequestMethod.POST)
	public boolean delNoticeOfLang(@RequestBody NoticeVO params) throws Exception {
		return noticeSVC.delNoticeOfLang(params);
	}
}
