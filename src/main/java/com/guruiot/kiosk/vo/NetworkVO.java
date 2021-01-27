package com.guruiot.kiosk.vo;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("networkVO")
@JsonInclude(Include.NON_NULL)
public class NetworkVO {
	
	private long uid;
	
	private String online;
	private String log;
	
	private String result;
}