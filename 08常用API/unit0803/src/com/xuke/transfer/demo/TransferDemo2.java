package com.xuke.transfer.demo;

public class TransferDemo2 {

	public static void main(String[] args) {
		String s="123";
		float f=Float.valueOf(s);
		float f2=Float.parseFloat(s);
		
		//超出int范围，转换失败
		int i=Integer.parseInt("12222222222222222222222222222222");
		
	}

}
