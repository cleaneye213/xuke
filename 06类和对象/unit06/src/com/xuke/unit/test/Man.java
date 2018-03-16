package com.xuke.unit.test;

public class Man extends Person{
	
	public Man() {
		System.out.println("Man的构造器");
	}
	
	//重写父类的方法
	void eat() {
		System.out.println("我比较能吃");
	}
	
	//重载
	void eat(String milk) {
		System.out.println("我喜欢吃"+milk);
	}
	
	protected void move() {
		System.out.println("运动。。。");
		//类内部可以访问私有修饰的方法和属性
		daDouDou();
	}
	
	private void daDouDou() {
		System.out.println("打豆豆");
	}
	
	void marry(Women women) {
		System.out.println(women.birthday);
		System.out.println("我结婚了！");
	}
}
