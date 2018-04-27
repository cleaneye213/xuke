package com.xuke.copy.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyAviByBufferedIO2 {

	public static void main(String[] args) throws IOException{
		//不能用字符流来读写图片，视频，以下纯粹是测试
		//复制视频文件 采用高效的字节缓冲流
		//0 创建流的对象
		//读取
		BufferedReader bist=new BufferedReader(new FileReader("D:\\file2\\a.avi"));
		//
		BufferedWriter bost=new BufferedWriter(new FileWriter("D:\\file2\\b.avi"));
		//1、先从D:\\file2\\a.avi读取视频
		char[] bt=new char[1024];
		int len=0;
		long start=System.currentTimeMillis();
		
		while((len=bist.read(bt))!=-1) {
			//2、把读取的信息直接写入到D:\\file2\\b.avi
			bost.write(bt,0,len);
		}
		
		//3、关闭流
		bist.close();
		bost.close();
		long end=System.currentTimeMillis();
		System.out.println((end-start)/1000);
	}

}
