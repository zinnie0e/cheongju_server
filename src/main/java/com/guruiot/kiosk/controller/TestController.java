package com.guruiot.kiosk.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.guruiot.kiosk.service.TestService;
import com.guruiot.kiosk.vo.TestVO;

@CrossOrigin(origins = "http://192.168.1.76:8088")
@RestController
public class TestController {
	@Resource
	private TestService testSVC;

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public List<TestVO> testSelectAll(Model model) throws Exception {
		List<TestVO> testList = new ArrayList<>();
		testList = testSVC.getTestSelectAll();
		
		model.addAttribute("testList", testList);
		
		return testList;
	}
	
	@RequestMapping(value="/test/multi", method=RequestMethod.GET)
	public List<TestVO> testMultiSelectAll2() throws Exception {		
		return testSVC.getTestMultiSelectAll();
	}
	
	@RequestMapping(value="/test2", method=RequestMethod.GET)
	public List<TestVO> testSelectAll2() throws Exception {		
		return testSVC.getTestSelectAll();
	}
	
	@RequestMapping(value="/test/max", method=RequestMethod.GET)
	public int testSelectMax() throws Exception {
		return testSVC.getTestSelectMax();
	}
	
	@RequestMapping(value="/test/insert", method=RequestMethod.GET)
	public boolean testInsertData(@RequestBody TestVO params) throws Exception {
		return testSVC.setTestInsert(params);
	}
	
	@RequestMapping(value="/test/insert2", method=RequestMethod.GET)
	public boolean testInsertData() throws Exception {
		TestVO testvo = new TestVO();
		testvo.setIndex(testSelectMax() + 1);
		testvo.setData("test");
		
		return testSVC.setTestInsert(testvo);
	}
	
	@RequestMapping(value="/test/update/data", method=RequestMethod.GET)
	public boolean testUpdateData(@RequestBody TestVO params) throws Exception {
		return testSVC.setTestUpdateData(params);
	}
	
	@RequestMapping(value="/test/update/data2", method=RequestMethod.GET)
	public boolean testUpdateData() throws Exception {
		TestVO testvo = new TestVO();
		testvo.setIndex(testSelectMax());
		testvo.setData("test");
		
		return testSVC.setTestUpdateData(testvo);
	}
	
	@RequestMapping(value="/test/delete", method=RequestMethod.GET)
	public boolean testDelete(@RequestBody TestVO params) throws Exception {
		return testSVC.setTestDelete(params);
	}
	
	@RequestMapping(value="/test/delete2", method=RequestMethod.GET)
	public boolean testDelete() throws Exception {
		TestVO testvo = new TestVO();
		testvo.setIndex(testSelectMax());
		
		return testSVC.setTestDelete(testvo);
	}
	
	@RequestMapping(value="/test/upload", method=RequestMethod.POST)
	public boolean testUpload(@RequestParam MultipartFile files) throws Exception {
		boolean result = false;
		
		try {
			String dir = "D:/";
			String path = dir + "/" + files.getOriginalFilename();
			files.transferTo(new File(path));
			result = true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	@RequestMapping(value="/test/uploads")
	public boolean testUploads(@RequestParam List<MultipartFile> files) throws Exception {
		boolean result = false;
		
		try {
			for(MultipartFile file : files) {
				String dir = "D:/";
				String path = dir + "/" + file.getOriginalFilename();
				file.transferTo(new File(path));
			}
			
			result = true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
