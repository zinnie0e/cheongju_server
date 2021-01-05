package com.guruiot.kiosk.vo;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("noticeVO")
@JsonInclude(Include.NON_NULL)
public class NoticeVO {
	//변수
	private String language;
	
	//공통컬럼
	private int uid;
	private String log;
	
	//
	private String notice;
}