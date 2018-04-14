package com.xuke.map.demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

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
		 * 1、entrySet()--》Set<Map.Entry<K,V>>
		 * 2、遍历set集合，直接获取key或value。。通过
		 * 3、getKey();
		 * 	getValue();
		 *
		 * */
		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String, String> temp = iterator.next();
			System.out.println(temp.getKey()+"-"+temp.getValue());
			
		}
	}

}
