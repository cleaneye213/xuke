package com.xuken.unit.demo.one;

public class TestDemo {

	public static void main(String[] args) {
		//父类调用成员变量（父类和子类都有）
		Person p=new Man();//向上转型
		System.out.println(p.age);
		
		//输出子类里的方法
		p.eat();
		
		Object obj=new Man();
		Man m=(Man)obj;
		m.eat();//向下转型
		System.out.println("============");
		//------------
		Women w=new Women();
		Person p2=new Person();
		p2.action(m);
		p2.action(w);
		
	}

}
