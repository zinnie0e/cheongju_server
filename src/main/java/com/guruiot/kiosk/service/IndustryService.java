package com.guruiot.kiosk.service;

import java.util.List;
import com.guruiot.kiosk.vo.AccountVO;
import com.guruiot.kiosk.vo.IndustryVO;

public interface IndustryService {
	
	List<IndustryVO> selIndustryList(IndustryVO params) throws Exception;
}
