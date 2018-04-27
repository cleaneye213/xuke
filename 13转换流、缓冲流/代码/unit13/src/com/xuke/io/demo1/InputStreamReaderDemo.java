package com.xuke.io.demo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException{
		// 用转换流读取文件信息
		//1 创建流对象（InputStreamReader）
		InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\file\\gg.txt"));
		//2 读取信息
		char[] ch=new char[1];
		int len=0;
		while((len=isr.read(ch))!=-1) {
			System.out.println(new String(ch,0,len));
		}
		//关闭流
		isr.close();
	}

}
