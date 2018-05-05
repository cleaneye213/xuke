package com.xuke.properties.demo1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesStoreDemo1 {

	public static void main(String[] args) throws IOException {
		//向属性文件写键值对
		//1、创建输出流对象 字节
		//true代表追加值
		OutputStream ost=new FileOutputStream("jdbc.txt",true);
		
		//2、创建Properties并设置值
		Properties pts=new Properties();
		pts.setProperty("userName1", "uuuu1");
		pts.setProperty("userName2", "uuuu2");
		pts.setProperty("userName3", "uuuu3");
		
		//3、写到文件
		pts.store(ost, "\r\n这是说明");
		
		//4关闭流
		ost.close();
	}

}
