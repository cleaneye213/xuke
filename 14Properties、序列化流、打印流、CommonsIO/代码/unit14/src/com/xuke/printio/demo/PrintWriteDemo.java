package com.xuke.printio.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriteDemo {

	public static void main(String[] args) throws IOException {
		//1、创建目的地字符输出流对象
		FileWriter fwt=new FileWriter("test1");
		//2、创建打印流对象
		PrintWriter pwt=new PrintWriter(fwt);
		//3、写字符串信息到文件中
		pwt.print("测试输出");
		pwt.print("测试输出1");
		pwt.println("测试输出2");
		
		//4、关闭流
		fwt.close();
		pwt.close();
	}

}
