package com.xuke.copy.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAviByBufferedIO {

	public static void main(String[] args) throws IOException{
		//复制视频文件 采用高效的字节缓冲流
		//0 创建流的对象
		//读取
		BufferedInputStream bist=new BufferedInputStream(new FileInputStream("D:\\file2\\a.avi"));
		//
		BufferedOutputStream bost=new BufferedOutputStream(new FileOutputStream("D:\\file2\\b.avi"));
		//1、先从D:\\file2\\a.avi读取视频
		byte[] bt=new byte[1024];
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
