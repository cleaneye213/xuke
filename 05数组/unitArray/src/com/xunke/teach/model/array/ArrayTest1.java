package com.xunke.teach.model.array;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		//1 静态定义
		String[] str= {"1","2","3"};
		String[] str1=new String[] {"1","2","3"};
		
		//2 动态定义
		String[] str2=new String[5];
		boolean[] str3=new boolean[4];
		
		//循环打印
		for(int i=0;i<str.length;i++) {
			System.out.println("str:"+str[i]);
		}
		for(int i=0;i<str1.length;i++) {
			System.out.println("str1:"+str1[i]);
		}
		
		//循环打印动态定义的空数组
		for (String b : str2) {
			System.out.println(b);
		}
		for (boolean b : str3) {
			System.out.println("boolean空数组："+b);
		}
		
		
		char[] str4=new char[5];
		for (char b : str4) {
			System.out.println("char空数组："+b+"char");
		}
		//null 空格(" ")  空值("") 
		
		//
	}

}
