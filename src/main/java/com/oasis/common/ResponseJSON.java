package com.oasis.common;

import java.io.Serializable;

public class ResponseJSON <T> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code;
	private String msg;
	private T data;
	public ResponseJSON(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = null;
	}
	
	public ResponseJSON(int code) {
		super();
		this.code = code;
		this.msg="";
		this.data=null;
	}

	public ResponseJSON(int code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

	public ResponseJSON() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ResponseJSON [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
}
