package com.peny.exception;

/**
 * 定义全局异常处理
 * @author acer
 *
 */
public class GoodException extends Exception{
	//定义异常信息
	public String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public GoodException(String message) {
		this.message=message;
	}
	
}
