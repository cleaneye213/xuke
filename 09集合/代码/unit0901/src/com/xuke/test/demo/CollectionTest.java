package com.xuke.test.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

	public static void main(String[] args) {
		//collection集合
		Collection c1=new ArrayList();
		c1.add("疯狂java");
		c1.add("Oracle进阶");
		System.out.println(c1);
		
		Collection c2=new ArrayList();
		c2.add("Mysql进阶");
		c2.add("java精通到放弃");
		c1.addAll(c2);
		
		System.out.println(c1);
		
		c1.remove("Oracle进阶");
		System.out.println(c1);
		
		//判断是否存在该对象
		c1.contains("java精通到放弃");
		System.out.println(c1.size());
		System.out.println(c1.isEmpty());
		Collection c3=null;
		//空指针异常
		//System.out.println(c3.isEmpty());
		
		Object[] array = c1.toArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
