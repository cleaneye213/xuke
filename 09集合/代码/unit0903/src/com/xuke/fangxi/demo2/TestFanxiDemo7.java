package com.xuke.fangxi.demo2;

import java.util.ArrayList;
import java.util.Collection;

import com.xuke.set.demo.Person;

public class TestFanxiDemo7 {

	public static void main(String[] args) {
		// 定义一个方法，接收一个集合对象(该集合有泛型)，
		//并打印出集合中的所有元素
		Collection<Person> c=new ArrayList();
		c.add(new Person("333",20));
		//new TestFanxiDemo7().print(c);
		//TestFanxiDemo7.print(c);
		TestFanxiDemo7.print2(c);
	}

	public static <T> void print(Collection<T> c) {
		System.out.println(c);
	}
	
	//只能传person或者person的子类  <=Person
	public static void print2(Collection<? extends Person> c) {
		System.out.println(c);
	}
	
	//只能传person或者person所有父类 >=Person
	public static void print3(Collection<? super Person> c) {
		System.out.println(c);
	}
}
