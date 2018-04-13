package com.xuke.fanxi.demo;

import com.xuke.set.demo.Person;

//由于接口限制传进来的对象类型，必须是Person的子类或者Person本身
//public class TestFanxiInterImpl2 implements TestFanxiInter2<Tiger>{
public class TestFanxiInterImpl2 implements TestFanxiInter2<Person>{


	public static void main(String[] args) {
		new TestFanxiInterImpl2().print(new Person("ddd", 12));;
	}

	@Override
	public void print(Person t) {
		// TODO Auto-generated method stub
		
	}
}
