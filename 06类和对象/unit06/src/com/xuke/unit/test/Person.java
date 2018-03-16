package com.xuke.unit.test;

public class Person {
	String sex;
	double height;
	double weight;
	String birthday="1970-00-00";
	
	//这才是构造器
	//有修饰符public 没返回值 方法名称跟类名同名
	public Person() {
		System.out.println("222如果是构造器的会先执行");
	}
	
	//不是构造器
	public Person Person(){
		System.out.println("111如果是构造器的会先执行");
		return new Person();
	}
	
	void eat() {
		System.out.println("吃饭");
	}
	
	void sleep() {
		System.out.println("睡觉");
	}
}

