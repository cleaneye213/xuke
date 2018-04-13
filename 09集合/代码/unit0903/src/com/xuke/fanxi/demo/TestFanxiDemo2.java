package com.xuke.fanxi.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xuke.set.demo.Person;

public class TestFanxiDemo2 {

	public static void main(String[] args) {
		//集合类标准写法
		List<Person> list=new ArrayList<>();
		//list.add("");
		list.add(new Person("aaa",20));
		list.add(new Person("bb",20));
		list.add(new Person("cc",20));
		
		Iterator<Person> iterator = list.iterator();
		while(iterator.hasNext()) {
			Person next = iterator.next();
			System.out.println(next);
		}
		//简单写法
		for (Person person : list) {
			System.out.println(person);
		}
	}

}
