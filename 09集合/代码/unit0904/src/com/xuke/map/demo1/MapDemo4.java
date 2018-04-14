package com.xuke.map.demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo4 {

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
		// values():-->Collection
		//可以通过Collection的迭代器进行遍历
		//也可以for-each进行遍历
		//缺点：不能获取到Key。只能遍历values
		for(String temp:map.values()) {
			System.out.println(temp);
		}
		
	}

}
