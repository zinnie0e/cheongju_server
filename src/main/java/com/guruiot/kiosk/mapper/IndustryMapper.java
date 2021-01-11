package com.guruiot.kiosk.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.guruiot.kiosk.vo.IndustryVO;

	@Mapper
	public interface IndustryMapper {
		public List<IndustryVO> selIndustryList(IndustryVO params);
		public List<IndustryVO> selIndustryList2(IndustryVO params);
}
