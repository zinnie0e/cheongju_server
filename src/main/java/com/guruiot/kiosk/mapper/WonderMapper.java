package com.guruiot.kiosk.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.guruiot.kiosk.vo.WonderVO;

@Mapper
public interface WonderMapper {
	public List<WonderVO> selWonderList(WonderVO params);
}
