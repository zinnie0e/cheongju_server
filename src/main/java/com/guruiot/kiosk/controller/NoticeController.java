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
}
