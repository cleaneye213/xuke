package com.xuke.list.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("bbb");
		set.add("22dddd");
		set.add(new User("张三",23));
		set.add("1111");
		set.add("asdfasd");
		set.add("dddd");
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Object next = (Object)iterator.next();
			System.out.println(next);
		}
	}

}
