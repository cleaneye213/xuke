package com.xuke.test.demo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		list.add("java基础");
		list.add(0, "java基础2");//list接口的
		list.addFirst("java基础3");
		list.addLast("java基础4");
		System.out.println(list);
		//获取并移除此列表的头（第一个元素）
		System.out.println(list.poll());
		//少了list.poll()的元素
		System.out.println(list);
		
		// 获取但不移除此列表的头（第一个元素）。
		System.out.println(list.peek());
		System.out.println(list);
	}

}
