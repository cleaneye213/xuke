package com.xuken.unit.demo.one;

public class TestDemoTwo {

	public static void main(String[] args) {
		
		Person p=new Person();
		p.actionB(new Man());
		p.actionB(new Women());
		
		//p.actionB("ddddd");//类型转换出错
		
		p.actionB("ddddd2");

		
	}

}
