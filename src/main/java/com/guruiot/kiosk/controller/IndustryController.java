package com.guruiot.kiosk.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.guruiot.kiosk.service.IndustryService;
import com.guruiot.kiosk.vo.IndustryVO;

@CrossOrigin(origins = "*")
@RestController
public class IndustryController {
	@Resource
	private IndustryService industrySVC;
	
	@RequestMapping(value = "/industry/select_industry_list", method = RequestMethod.POST)
	public List<IndustryVO> selAccountingSlip1(@RequestBody IndustryVO params) throws Exception {
		return industrySVC.selIndustryList(params);
	}	
	@RequestMapping(value = "/industry/select_industry_list2", method = RequestMethod.POST)
	public List<IndustryVO> selAccountingSlip2(@RequestBody IndustryVO params) throws Exception {
		return industrySVC.selIndustryList2(params);
	}	
	
	@RequestMapping(value = "/industry/select_industry", method = RequestMethod.POST)
	public List<IndustryVO> selIndustry() throws Exception {
		return industrySVC.selIndustry();
	}	
	@RequestMapping(value = "/industry/select_industry_search", method = RequestMethod.POST)
	public List<IndustryVO> selIndustrySearch(@RequestBody IndustryVO params) throws Exception {
		return industrySVC.selIndustrySearch(params);
	}	
	@RequestMapping(value = "/industry/select_industry_all_lang", method = RequestMethod.POST)
	public List<IndustryVO> selIndustryAllLang(@RequestBody IndustryVO params) throws Exception {
		return industrySVC.selIndustryAllLang(params);
	}	
	@RequestMapping(value="/industry/select_company_maxuid", method=RequestMethod.POST)
	public int selIndustryMaxUid() throws Exception {
		return industrySVC.selIndustryMaxUid();
	}
	
	@RequestMapping(value="/industry/insert_company", method=RequestMethod.POST)
	public boolean inIndustry(@RequestBody IndustryVO params) throws Exception {
		return industrySVC.inIndustry(params);
	}
	@RequestMapping(value="/industry/update_company", method=RequestMethod.POST)
	public boolean upIndustry(@RequestBody IndustryVO params) throws Exception {
		return industrySVC.upIndustry(params);
	}
	@RequestMapping(value="/industry/delete_company", method=RequestMethod.POST)
	public boolean delIndustry(@RequestBody IndustryVO params) throws Exception {
		return industrySVC.delIndustry(params);
	}
	
	//@RequestMapping(value="/industry/upload_logo", method=RequestMethod.POST)
	//public boolean testUpload(@RequestParam MultipartFile files) throws Exception {
	//	boolean result = false;
	//	try {
	//		String dir = "C:/";
	//		String path = dir + "/external_image/com_logo/" + files.getOriginalFilename();
	//		
	//		System.out.println(files.getOriginalFilename());
	//		System.out.println(path);
	//		
	//		files.transferTo(new File(path));
	//		
	//		result = true;
	//	} catch(Exception e) {
	//		e.printStackTrace();
	//	}
	//	return result;
	//}
	
	@RequestMapping(value="/industry/upload_logo", method=RequestMethod.POST)
	public String testUpload(MultipartHttpServletRequest request) throws Exception {
		String result = "";
		try {
			MultipartFile files =  request.getFile("files");
			String namecode =  request.getParameter("namecode");
			
			String dirPath = "C://Program Files/Apache Software Foundation/Tomcat 8.5/webapps/external_image/com_logo/";
			
		    String orgName = files.getOriginalFilename();
		    String exc = orgName.substring(orgName.lastIndexOf(".") + 1, orgName.length());
		    
		    String newName = namecode + "." + exc;
			
			files.transferTo(new File(dirPath + newName));
			result = newName;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
