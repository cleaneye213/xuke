package com.xuke.randomaccess.demo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException{
		//从某个文件的某个文件进行插入字符串
		RandomAccessFile raf=new RandomAccessFile(new File("test5.txt"), "rw");
		String readLine = raf.readLine();
		System.out.println(new String(readLine.getBytes("ISO-8859-1"),"UTF-8"));
		
		//raf.seek(20000);//指针超过文件的长度也不会报错，但不会正常读取
		raf.seek(4);
		//会覆盖后面的内容，所以不能直接插入
		raf.write("yyyy".getBytes());
		
		//关闭流
		raf.close();

	}

}
