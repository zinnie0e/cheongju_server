package com.guruiot.kiosk.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.guruiot.kiosk.vo.UsageVO;

@Mapper
public interface UsageMapper {
	public UsageVO selAllCountUsage() throws Exception;
	public List<UsageVO> selAllUsage() throws Exception;
	public UsageVO selUsage(UsageVO params) throws Exception;
	public List<UsageVO> selUsageDayList(UsageVO params) throws Exception;
	public int inUsage(UsageVO params) throws Exception;
	public int upUsage(UsageVO params) throws Exception;
}
