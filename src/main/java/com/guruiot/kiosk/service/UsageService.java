package com.guruiot.kiosk.service;

import java.util.List;
import com.guruiot.kiosk.vo.UsageVO;

public interface UsageService {
	UsageVO selAllCountUsage() throws Exception;
	List<UsageVO> selAllUsage() throws Exception;
	UsageVO selUsage(UsageVO params) throws Exception;
	List<UsageVO> selUsageDayList(UsageVO params) throws Exception;
	boolean inUsage(UsageVO params) throws Exception;
	boolean upUsage(UsageVO params) throws Exception;
}
