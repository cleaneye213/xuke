package com.xuke.myexception.demo;

import java.util.HashMap;
import java.util.Map;

public class MyExceptionDemo2 extends RuntimeException {
	
	private static Map<String,String> map=new HashMap<>();
	
	static {
		map.put("001",ExceptionContants.UPDATE_USER_FAILE);
		map.put("002",ExceptionContants.UPDATE_USER_FAILE);
		map.put("003","oooooo");
		map.put("004","pppppppppppppp");
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 2110102214726758217L;

    private String errorCode = "-1";
    private String errorMessage;
    
    public MyExceptionDemo2(String errorCode) {
    	this.errorCode=errorCode;
    	this.errorMessage=map.get(errorCode);
    }
    
    public MyExceptionDemo2(String errorCode,String errorMessage) {
    	this.errorCode=errorCode;
    	this.errorMessage=errorMessage;
    }
    
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
    
    @Override
    public String getMessage() {
    	return this.getErrorMessage();
    }
	
}
