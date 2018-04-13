package com.xuke.fanxi.demo;

import com.xuke.set.demo.Person;

public class TestFanxiInterImpl implements TestFanxiInter<Person>{

	@Override
	public void print(Person t) {
		System.out.println(t);
		
	}

	public static void main(String[] args) {
		new TestFanxiInterImpl().print(new Person("ddd", 12));;
	}
}
