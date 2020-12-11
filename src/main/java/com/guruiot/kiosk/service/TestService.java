package com.guruiot.kiosk.service;

import java.util.List;
import com.guruiot.kiosk.vo.TestVO;

public interface TestService {
	List<TestVO> getTestMultiSelectAll() throws Exception;
	List<TestVO> getTestSelectAll() throws Exception;
	int getTestSelectMax() throws Exception;
	
	boolean setTestInsert(TestVO params) throws Exception;
	boolean setTestUpdateData(TestVO params) throws Exception;
	boolean setTestDelete(TestVO params) throws Exception;
}
