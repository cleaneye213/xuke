package com.xuke.map.demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo3 {

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
		// JDK1.5中,应用新特性For-Each循环  
		for ( Map.Entry<String, String> temp: map.entrySet()) {
			System.out.println(temp.getKey()+"-"+temp.getValue());
		}
		
		
		for(Entry<String,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}

}
