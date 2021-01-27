package com.guruiot.kiosk.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.guruiot.kiosk.vo.NetworkVO;

@Mapper
public interface NetworkMapper {
	
	public List<NetworkVO> selAllNetwork() throws Exception;
	
	public int inNetwork(NetworkVO params) throws Exception;
	public int delNetwork() throws Exception;
}
