package com.guruiot.kiosk.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.guruiot.kiosk.vo.TestVO;

@Mapper
public interface TestMapper {
	public List<TestVO> testMultiSelectAll() throws Exception;
	public List<TestVO> testSelectAll() throws Exception;
	public Integer testSelectMax() throws Exception;
	
	public int testInsert(TestVO params) throws Exception;
	public int testUpdateData(TestVO params) throws Exception;
	public int testDelete(TestVO params) throws Exception;
}
