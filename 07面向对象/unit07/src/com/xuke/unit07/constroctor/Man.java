package com.xuke.unit07.constroctor;

public class Man{

	public Man() {
		super();//不写也会自动调用
		System.out.println("子类空构造器");
	}
	
	public Man(String name) {
		this();//
		System.out.println("子类多参数构造器");
	}
	
	@Override
	public String toString() {
		System.out.println("Man");
		return super.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("程序开始执行");
		//Man m=new Man();//没传参数时，都是调用空的构造器，父类空构造器->子类空构造器
		
		Man man=new Man("张三");
		System.out.println("程序执行结束");
		
		Object obj=new Object();
		System.out.println(man);
	}
}
