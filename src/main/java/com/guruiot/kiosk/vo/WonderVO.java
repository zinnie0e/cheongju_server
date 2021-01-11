package com.guruiot.kiosk.vo;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("WonderVO")
@JsonInclude(Include.NON_NULL)
public class WonderVO {
	//변수
	private String language;

	private String shop_cate;
	private String name;
	private String logo;
	private int flow;
	private String room;
	private int image_x;
	private int image_y;
	private int uid;
	private String log;
	
}