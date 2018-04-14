package com.xuke.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

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
		//乱序
		Collections.shuffle(list);
		for(int temp:list) {
			System.out.println(temp);
		}
		System.out.println("===============");
		//进行排序
		Collections.sort(list);
		for(int temp:list) {
			System.out.println(temp);
		}
		System.out.println("===============");
	}

}
