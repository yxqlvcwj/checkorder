package com.dwd.www.untils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsonData implements Serializable {
	private static final long serialVersionUID = 1L;

	//状态码,0表示成功，-1表示失败
	private int code;

	//结果信息
	private  Map<String ,List> map;

	//错误描述
	private String msg;
	
	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setCode(int code) {
		this.code = code;
	}


	public Map<String, List> getMap() {
		return map;
	}

	public void setMap(Map<String, List> map) {
		this.map = map;
	}

	public JsonData(int code) {
		super();
		this.code = code;
	}

	public JsonData(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public JsonData(int code, Map<String ,List> map, String msg) {
		this.code = code;
		this.map=map;
		this.msg = msg;
	}
}
