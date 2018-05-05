package com.xuke.properties.demo1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesLoadDemo3 {

	public static void main(String[] args) throws IOException {
		//读取属性文件里的键值对
		//1 创建流对象 缓存字节流输入流
		InputStream ist=new FileInputStream("jdbc.properties");
		BufferedInputStream bis=new BufferedInputStream(ist);
		//2
		Properties pts=new Properties();
		//3 加载流
		pts.load(bis);
		
		//4遍历输出
		Enumeration<Object> keys = pts.keys();
		while(keys.hasMoreElements()) {
			System.out.println(pts.getProperty(keys.nextElement().toString()));
		}
		//5
		ist.close();
	}

}
