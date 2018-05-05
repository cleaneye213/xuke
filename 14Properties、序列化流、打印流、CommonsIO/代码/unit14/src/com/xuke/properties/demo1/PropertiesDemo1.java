package com.xuke.properties.demo1;

import java.util.Enumeration;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {

	public static void main(String[] args) {
		Properties pts=new Properties();
		//赋值
		pts.setProperty("userName", "root");
		pts.setProperty("password", "123456");
		pts.setProperty("port", "3306");
		pts.setProperty("url", "http://127.0.0.1/mysql");
		
		//取值
		System.out.println(pts.getProperty("userName"));
		System.out.println("==============");
		//遍历1
		//不会按顺序输出
		//内部用哈希算法计算内存存放位置
		Set<Entry<Object,Object>> entrySet = pts.entrySet();
		for(Entry<Object, Object> entry:entrySet) {
			System.out.println(pts.getProperty(entry.getKey().toString()));
		}
		System.out.println("==============");
		//遍历2
		Set<Object> keySet = pts.keySet();
		for(Object temp:keySet) {
			System.out.println(pts.getProperty(temp.toString()));
		}
		
		//遍历3
		Enumeration<Object> keys = pts.keys();
		//
	}

}
