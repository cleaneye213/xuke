package com.xuke.myexception.demo;

public class MyException extends RuntimeException{
	
	public MyException() {
		super();
	}
	
	public MyException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage()+"dddddddd";
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("这是我自定义的异常信息");	
		super.printStackTrace();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -6698435954380609516L;
	
	

}
