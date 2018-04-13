package com.xuke.list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

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
		
		//第一种遍历方式
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
			//在遍历时，不能出现对集合外部元素的操作
			//list.remove(obj);
			//可以通过迭代器的remove来删除集合的元素
			//比需要先iterator.next(),即指向集合下一个元素才可以
			//iterator.remove();
		}
		
		//第二种遍历方式
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//listiterator
		ListIterator listIterator = list.listIterator();
		while(listIterator.hasPrevious()) {
			Object obj = listIterator.previous();
			System.out.println(obj);
		}
	}

}
