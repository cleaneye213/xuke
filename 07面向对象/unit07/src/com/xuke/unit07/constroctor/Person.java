package com.xuke.unit07.constroctor;

public class Person {
	String name;
	
	public Person() {
		System.out.println("父类空构造器");
	}

	public Person(String name) {
		name=name;
		System.out.println("父类多参数构造器");
	}
	
}
