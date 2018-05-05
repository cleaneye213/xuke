package com.xuke.properties.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesLoadDemo2 {

	public static void main(String[] args) throws IOException {
		//读取属性文件里的键值对
		//1 创建流对象 字符流输入流
		//InputStream ins=new FileInputStream("F:\\workHaiSiP2P_nc\\unit14\\jdbc.properties");
		//InputStream ins=new FileInputStream("jdbc.properties");
		FileReader frd=new FileReader("jdbc.txt");
		//2
		Properties pts=new Properties();
		//3 加载流
		pts.load(frd);
		
		//4遍历输出
		Enumeration<Object> keys = pts.keys();
		while(keys.hasMoreElements()) {
			System.out.println(pts.getProperty(keys.nextElement().toString()));
		}
		
		//5关闭流
		frd.close();
		
	}

}
