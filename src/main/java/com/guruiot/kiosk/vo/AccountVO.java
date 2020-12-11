package com.guruiot.kiosk.vo;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("accountVO")
@JsonInclude(Include.NON_NULL)
public class AccountVO {
	private int index;
	private String id;
	private String pw;
	private String name;
	private int grant;
	private String ip;
	private int state;
	private String join_log;
	private String log;
}