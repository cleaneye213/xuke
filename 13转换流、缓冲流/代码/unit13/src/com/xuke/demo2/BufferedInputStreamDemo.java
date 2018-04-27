package com.xuke.demo2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException{
		//1 创建流对象
		InputStream ist=new FileInputStream("D:\\file\\gg.txt");
		BufferedInputStream bis=new BufferedInputStream(ist);
		
		//2 读取数据
		byte[] bt=new byte[1024];
		int len=0;
		while((len=bis.read(bt))!=-1) {
			System.out.println(new String(bt,0,len));
		}
		//3关闭流
		bis.close();
	}

}
