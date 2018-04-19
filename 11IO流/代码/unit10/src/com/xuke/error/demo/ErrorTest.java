package com.xuke.error.demo;

public class ErrorTest {

	public static void main(String[] args) {
		try {
			String[] ary=new String[Integer.MAX_VALUE*Integer.MAX_VALUE*Integer.MAX_VALUE*Integer.MAX_VALUE*Integer.MAX_VALUE];
		}catch(Exception e) {
			
		}
		//如果上面代码出现错误，以下代码不会被执行
		System.out.println("dddd");
	}

}
