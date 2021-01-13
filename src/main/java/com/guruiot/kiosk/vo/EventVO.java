package com.guruiot.kiosk.vo;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("eventVO")
@JsonInclude(Include.NON_NULL)
public class EventVO {
	//변수
	private String language;
	private String found_val;
	
	//공통컬럼
	private int uid;
	private String log;
	
	//event_XX
	private int found_cate;
	private int event_cate;
	private String title;
	private String start_date;
	private String end_date;
	private String start_time;
	private String end_time;
	private String place;
	private String manager;
	private String tel;
	private String poster;
	
	//event_detail_XX
	private String detail_title;
	private String detail_body;
	private String event_uid;
	
	//foundation_info
	private int found_auth;
	private int event_count;
	private String found_name;
}