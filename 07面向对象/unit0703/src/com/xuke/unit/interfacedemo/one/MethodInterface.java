package com.xuke.unit.interfacedemo.one;

public interface MethodInterface {
	//没有成员变量
	public final String name="张三";
	
	//public MethodInterface() {};

	//方法默认是public abstract修饰的方法
	void eat();
	//默认为公用的抽象方法
	public String print();
}
