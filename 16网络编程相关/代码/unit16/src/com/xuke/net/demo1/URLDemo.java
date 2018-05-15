package com.xuke.net.demo1;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) throws IOException {
		// 获取小说网页
		URL url=new URL("http://www.wanmeishijie.info/2.html");
		
		//通过流的方式来下载
		//获取网页内容的输入流
		InputStream iniStream = url.openStream();
		
		//创建输出流，生成一个网页
		FileWriter fileWriter=new FileWriter(new File("2.html"));
		BufferedWriter bwt=new BufferedWriter(fileWriter);
		
		//读取html并写入到文件中
		byte[] bt=new byte[1024];
		int len=0;
		while((len=iniStream.read(bt))!=-1) {
			bwt.write(new String(bt,0,len));
		}

		//关闭流
		iniStream.close();
		bwt.close();
	}

}
