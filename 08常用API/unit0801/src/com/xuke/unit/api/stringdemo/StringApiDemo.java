package com.xuke.unit.api.stringdemo;

public class StringApiDemo {

	public static void main(String[] args) {
		byte[] bt= {97,98,99,100};
		String str=new String(bt);
		System.out.println(str);
		
		//int offset, int length
		String str2=new String(bt,0,2);
		System.out.println(str2);
		
		String str3=new String(new char[]{'a','3','y'});
		System.out.println(str3);
	}

}
