package com.xuke.unit.staticdemo.one;

public class Person {
	public static String name;
	
	public static final void eat() {
		
		System.out.println("静态方法");
	}
	public void drink() {
		System.out.println("喝水");
	}
	
	public void move() {
		//调用eat方法
		Person.eat();
		//this.eat();//不建议这么调用
		
		drink();
		System.out.println("非静态方法"+name);
	}

	public static void main(String[] args) {
		Person p=new Person();
		p.move();
		p.eat();//不建议 这样调用
		Person.eat();//调用静态方法用类名.方法名
		System.out.println(p.name);
	}

}
