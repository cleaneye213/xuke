package com.xuke.map.demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		//新增元素
		map.put("aaa", "java基础");
		map.put("bbb", "java中级");
		map.put("ccc", "java高级");
		map.put("ddd", "java web");
		map.put("ddd", "java web1111");
		
		System.out.println(map.size());
		
		//遍历
		/*
		 * 1、keySet() ；获取key的集合->Set
			2、通过遍历Set集合，来获取Key值。
			3、获取到Key值后就可以直接通过
			map.get(key);获取到当前的值
		 * */
		Set<String> kSet = map.keySet();
		Iterator<String> iterator = kSet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			String temp = map.get(key);
			System.out.println(key+"-"+temp);
		}
	}

}
