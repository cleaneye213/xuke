package com.xuke.transfer.demo;

public class TransferDemo {

	public static void main(String[] args) {
		//基本数据类型转字符串
		String str=String.valueOf(123);
		
		//基本数据类型转包装类
		int i=123;
		Integer ig=Integer.valueOf(i);
		ig=i;
		ig=Integer.parseInt("123");
		
		//
		Integer a=3;
		Integer b=3;
		System.out.println(a==b);
		System.out.println(b.equals(a));
		System.out.println("=============");
		Integer a1=new Integer(3);
		Integer b1=new Integer(3);
		System.out.println(a1==b1);//比较的是内存地址
		System.out.println(b1.equals(a1));//比较的是内容
		System.out.println("=============");
		
		Integer c=128;
		Integer d=128;
		System.out.println(c==d);
		System.out.println(d.equals(c));
	}

}
