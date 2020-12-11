package com.guruiot.kiosk.vo;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("LoginVO")
@JsonInclude(Include.NON_NULL)
public class LoginVO {
	private String id;
	private String pw;
	private String jsessionid;
	private String result;
}