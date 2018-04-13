package com.xuke.list.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		Set set=new TreeSet();
		set.add(5);
		set.add(3);
		set.add(12);
		set.add(65);
		set.add(88);
		set.add(11);
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Object next = (Object)iterator.next();
			System.out.println(next);
		}
	}

}
