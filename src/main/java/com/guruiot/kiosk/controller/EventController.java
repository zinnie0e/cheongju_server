package com.guruiot.kiosk.controller;

import java.io.File;
import java.util.List;
import java.io.*;
import java.util.*;
import java.text.*;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.guruiot.kiosk.service.EventService;
import com.guruiot.kiosk.vo.EventVO;

@CrossOrigin(origins = "*")
@RestController
public class EventController {
	@Resource
	private EventService eventSVC;

	@RequestMapping(value="/event/select_event_list", method=RequestMethod.POST) 
	public List<EventVO> selEvent(@RequestBody EventVO params) throws Exception { 
		return eventSVC.selEvent(params); 
	}
	@RequestMapping(value="/event/select_event_of_found_list", method=RequestMethod.POST) 
	public List<EventVO> selEventOfFound(@RequestBody EventVO params) throws Exception { 
		return eventSVC.selEventOfFound(params); 
	}
	@RequestMapping(value="/event/select_event_detail_list", method=RequestMethod.POST) 
	public List<EventVO> selEventDetail(@RequestBody EventVO params) throws Exception { 
		return eventSVC.selEventDetail(params); 
	}
	@RequestMapping(value="/event/select_event_all_lang_list", method=RequestMethod.POST) 
	public List<EventVO> selEventAllLang(@RequestBody EventVO params) throws Exception { 
		return eventSVC.selEventAllLang(params); 
	}
	@RequestMapping(value="/event/select_event_maxuid", method=RequestMethod.POST)
	public int selEventMaxUid() throws Exception {
		return eventSVC.selEventMaxUid();
	}
	@RequestMapping(value="/event/select_event_maxcount", method=RequestMethod.POST)
	public int selEventMaxCount(@RequestBody EventVO params) throws Exception {
		return eventSVC.selEventMaxCount(params);
	}
	@RequestMapping(value="/event/select_event_promotion", method=RequestMethod.POST) 
	public List<EventVO> selEventPoster() throws Exception { 
		return eventSVC.selEventPoster(); 
	}
	@RequestMapping(value="/event/insert_event", method=RequestMethod.POST)
	public boolean inEvent(@RequestBody EventVO params) throws Exception {
		return eventSVC.inEvent(params);
	}
	@RequestMapping(value="/event/insert_event_detail", method=RequestMethod.POST)
	public boolean inEventDetail(@RequestBody EventVO params) throws Exception {
		return eventSVC.inEventDetail(params);
	}
	@RequestMapping(value="/event/update_event", method=RequestMethod.POST)
	public boolean upEvent(@RequestBody EventVO params) throws Exception {
		return eventSVC.upEvent(params);
	}
	@RequestMapping(value="/event/update_event_detail", method=RequestMethod.POST)
	public boolean upEventDetail(@RequestBody EventVO params) throws Exception {
		return eventSVC.upEventDetail(params);
	}
	@RequestMapping(value="/event/delete_event", method=RequestMethod.POST)
	public boolean delEvent(@RequestBody EventVO params) throws Exception {
		return eventSVC.delEvent(params);
	}
	@RequestMapping(value="/event/delete_event_detail", method=RequestMethod.POST)
	public boolean delEventDetail(@RequestBody EventVO params) throws Exception {
		return eventSVC.delEventDetail(params);
	}
	
 
	@RequestMapping(value="/event/upload_poster", method=RequestMethod.POST)
	public String testUpload(MultipartHttpServletRequest request) throws Exception {
		String result = "";
		try {
			MultipartFile files =  request.getFile("files");
			String namecode =  request.getParameter("namecode");
			
			String dirPath = "C://Program Files/Apache Software Foundation/Tomcat 8.5/webapps/external_image/promotion/";
			
		    String orgName = files.getOriginalFilename();
		    String exc = orgName.substring(orgName.lastIndexOf(".") + 1, orgName.length());
		    
		    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		    Date nowDate = new Date();
		    String dateString = formatter.format(nowDate);
		    
		    String newName = namecode + "_" + dateString + "." + exc;
			
			files.transferTo(new File(dirPath + newName));
			result = newName;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
