package com.xuke.stringbufferdemo.one;

public class StringBufferTest {

	public static void main(String[] args) {
		
		//StringBuffer 常用方法
		StringBuffer sc=new StringBuffer();
		sc.append("aaa");
		sc.append("nndnd");
		
		//insert
		sc.insert(0, "12345");
		System.out.println(sc.toString());
		//delete
		sc=new StringBuffer("1234567890");
		sc.delete(1, 5);//17890?167890-->167890
		System.out.println(sc.toString());
		
		//reverse
		System.out.println(sc.reverse());
		
		String str="dsdfsdf";
		str.substring(1, 5);
		System.out.println(str);//dsdfsdf
		
		
	}

}
