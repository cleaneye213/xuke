package com.xuke.unit.abstractdemo.one;

//有抽象方法的类，肯定是一个抽象类
public abstract class MyClassDemo {
	public String name;
	
	public void move() {
		System.out.println("移动");
	}
	
//	private MyClassDemo() {
//		
//	}
	
	
	//abstract修饰的方法不需要有方法体
	public abstract void eat();
//	public abstract eat() {
//		
//	}

	public static void main(String[] args) {
		//抽象类不能被实例化
		//MyClassDemo my=new MyClassDemo();
	}

}
