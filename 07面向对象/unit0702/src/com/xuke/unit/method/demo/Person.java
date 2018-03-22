package com.xuke.unit.method.demo;

public class Person {
	
	static{
		//第一次被实例化对象时执行，而且只执行一次
		System.out.println("静态代码块开始执行");
	}
	
	{
		System.out.println("代码块开始执行");
	}
	
	public Person() {
		System.out.println("构造器开始执行");
	}
	
	

	public static void main(String[] args) {
		Person p=new Person();
		System.out.println("=======================");
		Person p2=new Person();
	}

}
