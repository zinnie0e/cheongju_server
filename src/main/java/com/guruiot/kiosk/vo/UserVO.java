package com.guruiot.kiosk.vo;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("userVO")
@JsonInclude(Include.NON_NULL)
public class UserVO {
	
	private int uid;
	
	private String user_id;
	private String user_pw;
	private int user_auth;
	private String user_name;
	private String log;
}