package com.xuken.unit.demo.one;

public class Person {
	
	int age=10;
	
	void eat() {
		System.out.println("eat");
		
	}

	void action(Person person) {
		person.eat();
	}
	
	
	void actionB(Object obj) {
		//为了代码的健壮性考虑，需要在类型转换时判断是否可以转换
		//instanceof
		if(obj instanceof Person) {
			Person p=(Person)obj;
			p.eat();
		}else {
			System.out.println("请传一个Person");
		}
		
	}
	
	void actionC(Person p) {
		Man m=(Man)p;
		m.eat();
	}
}
