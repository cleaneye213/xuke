package com.xuke.fanxi.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xuke.set.demo.Person;

public class TestFanxiDemo {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(new Person("来来来",12));
		list.add(new Person("来来来",13));
		list.add(new Tiger("来来来22",19));
		list.add(new Person("来来来1",22));
		list.add(new Tiger("来来来",13));
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Person next = (Person)iterator.next();
			System.out.println(next);
		}
	}

}
