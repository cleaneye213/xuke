package com.xuke.unit.regex.demo;

import java.util.Arrays;

public class RegexTest2 {

	public static void main(String[] args) {
		String strId="111-2323-sdfsdf-23432";
		String[] arryStr=strId.split("-");
		System.out.println(Arrays.toString(arryStr));
		
		//不要用正则表达式的关键字来做为分隔符
		strId="111.2323.sdfsdf.23432";
		
		arryStr=strId.split("\\.");
		System.out.println(Arrays.toString(arryStr));
	}

}
