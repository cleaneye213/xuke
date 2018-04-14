package com.xuke.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsDemo3 {

	public static void main(String[] args) {
		//
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(12);
		list.add(32);
		list.add(7);
		list.add(32);
		list.add(92);
		list.add(22);
		list.add(32);
		
		for(int temp:list) {
			System.out.println(temp);
		}
		System.out.println("===============");
		
		//把线程不安全的集合转为线程安全的集合
		Collections.synchronizedList(list);
		for(int temp:list) {
			System.out.println(temp);
		}
		System.out.println("===============");
		
		Map<String,List<String>> map=new HashMap<>();
	}

}
