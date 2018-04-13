package com.xuke.fanxi.demo;

/**
 * 泛型类
 * @author Dell
 *
 * @param <T>
 */
public class ResponseMes<T> {
	
	private String message;

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		//转成json串
		this.t = t;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ResponseMes [message=" + message + ", t=" + t + "]";
	}
	
	
	
}
