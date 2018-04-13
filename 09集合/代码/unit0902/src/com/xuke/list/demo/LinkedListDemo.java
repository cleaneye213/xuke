package com.xuke.list.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List list2=new ArrayList();
		//linkedList的特有的方法
		LinkedList list=new LinkedList();
		list.add("aaa1");
		list.addLast("aaa3");
		list.add("aaa4");
		list.addFirst("aaa2");
		
		System.out.println(list.getFirst());
		//获取第一个元素，并移除
		System.out.println(list.poll());
		//false
		System.out.println(list.contains("aaa2"));
		//从尾部添加一个元素
		list.offer("aaa999");
		System.out.println(list.getLast());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
