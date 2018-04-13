package com.xuke.list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo2 {

	public static void main(String[] args) {
		//继承了Iterble接口
		//Iterble只定义了一个方法iterator() 
        //返回一个在一组 T 类型的元素上进行迭代的迭代器。
		//list接口要继承Iterble接口，及需定义iterator() 
		//ArrayList实现list接口，即必须实现iterator()方法
		//iterator()方法返回的是Iterator对象（必须指向接口实现类）
		//ArrayList内部定义了一个内容类实现Iterator接口,实例化后，同
		//通过iterator()方法返回，供外部进行调用
		List list=new ArrayList();
		list.add("aaa1");
		list.add("aaa2");
		list.add("aaa3");
		list.add("aaa4");
		list.add("aaa5");
		
		
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			String next = (String) lit.next();
			System.out.println(next);
		}
		System.out.println("***************");
		while (lit.hasPrevious()) {
			String next = (String) lit.previous();
			System.out.println(next);
		}

	}

}
