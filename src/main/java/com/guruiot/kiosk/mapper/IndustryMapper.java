package com.guruiot.kiosk.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guruiot.kiosk.vo.EventVO;
import com.guruiot.kiosk.vo.IndustryVO;

	@Mapper
	public interface IndustryMapper {
		public List<IndustryVO> selIndustryList(IndustryVO params);
		public List<IndustryVO> selIndustryList2(IndustryVO params);
		
		public List<IndustryVO> selIndustry();
		public List<IndustryVO> selIndustrySearch(IndustryVO params);
		public List<IndustryVO> selIndustryAllLang(IndustryVO params);
		public Integer selIndustryMaxUid() throws Exception;
		
		public int inIndustry(IndustryVO params) throws Exception;
		public int upIndustry(IndustryVO params) throws Exception;
		public int delIndustry(IndustryVO params) throws Exception;
}
