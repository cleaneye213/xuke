package com.xuke.fanxi.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xuke.set.demo.Person;

public class TestFanxiDemo3 {

	public static void main(String[] args) {
		//集合类标准写法
		Set<Person> st=new TreeSet<>();
		//list.add("");
		st.add(new Person("aaa",20));
		st.add(new Person("bb",23));
		st.add(new Person("cc",10));
		
		Iterator<Person> iterator = st.iterator();
		while(iterator.hasNext()) {
			Person next = iterator.next();
			System.out.println(next);
		}
		//简单写法
		for (Person person : st) {
			System.out.println(person);
		}
		
		Person[] p=new Person[st.size()];
		st.toArray(p);
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
	}

}
