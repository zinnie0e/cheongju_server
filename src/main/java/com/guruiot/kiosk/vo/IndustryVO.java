package com.guruiot.kiosk.vo;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("IndustryVO")
@JsonInclude(Include.NON_NULL)
public class IndustryVO {
	//변수
	private String language;

	private int com_cate;
	private String name;
	private String owner;
	private String tel;
	private String email;
	private int flow;
	private String room;
	private String busi1;
	private String busi2;
	private String busi3;
	private String busi4;
	private String busi5;
	private String item;
	private String logo;
	private String homepage; 
	private int image_x;
	private int image_y;
	private int uid;
	private String log;
	
}