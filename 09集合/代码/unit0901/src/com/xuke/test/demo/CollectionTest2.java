package com.xuke.test.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest2 {

	public static void main(String[] args) {
		//collection集合
		Collection c1=new ArrayList();
		Person p1=new Person("张三",18);
		Person p2=new Person("张三2",19);
		Person p3=new Person("张三3",28);
		c1.add(p1);
		c1.add(p2);
		c1.add(p3);
		c1.add(p1);
		
		//自定义对象时，建议toString()要重写
		Object[] array = c1.toArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println(c1.contains(p1));
		System.out.println(c1.contains(new Person("张三",18)));
		
		//为了判断同名及年龄相同即为相同对象person
		//需要重写equals() 和hashCode()
		System.out.println(p1.hashCode());
		System.out.println(new Person("张三",18).hashCode());
	}

}
