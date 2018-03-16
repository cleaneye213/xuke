package com.xuke.unit.test;

public class Test2 {

	public static void main(String[] args) {
		//父类指向子类（多态）
		Person p=new Man();
		p.eat();//调用的是子类的方法
		
		
	}

}
