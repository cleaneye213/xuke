package com.xuke.set.demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestSetSortDemo2 {

	public static void main(String[] args) {
		Set set=new TreeSet(new MyCompartor());
		
		set.add(new Person("张三",20));
		set.add(new Person("张三",25));
		set.add(new Person("张三",15));
		set.add(new Person("张三",40));
		set.add(new Person("张三",28));
		
		//如果Person没有实现Comparable接口的话
		//会报java.lang.ClassCastException: 
		//com.xuke.set.demo.Person cannot be cast to java.lang.Comparable
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Person next = (Person)iterator.next();
			System.out.println(next);
		}
	}

}