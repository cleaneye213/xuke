package com.xuke.set.demo;

import java.util.Comparator;

public class MyCompartor implements Comparator<Person>{

		@Override
		public int compare(Person p1, Person p2) {
			System.out.println("11111");
			if(p1.getAge()>p2.getAge()) {
				return -1;
			}else if(p1.getAge()<p2.getAge()){
				return 1;
			}
			return 0;
		}
		
}
