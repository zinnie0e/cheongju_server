package com.guruiot.kiosk.vo;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("usageVO")
@JsonInclude(Include.NON_NULL)
public class UsageVO {
	
	private long uid;
	private String date;
	private long event_cnt;
	private long industry_cnt;
	private long wonder_cnt;
	private long craft_cnt;
	private long library_cnt;
	private long media_cnt;
	private long foundation_cnt;
	private long museum_cnt;
	private long dongbu_cnt;
	private long parking_cnt;
	private long hours_cnt;
	private long tour_cnt;
}