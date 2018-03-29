package com.xuke.unit.regex.demo;

public class RegexTest {

	public static void main(String[] args) {
		String str="abc\\\\ahhhh\\acb";
		String str1=str.replace("a","A");
		String str2=str.replaceAll("a","A");
		
		System.out.println(str1);
		System.out.println(str2);
		
		str1=str.replace("ab","A");
		str2=str.replaceAll("[abc]","A");
		
		System.out.println(str1);
		System.out.println(str2);

		
		String regx="^(\\-|\\+)?\\d+(\\.\\d+)?$";
	}

}
