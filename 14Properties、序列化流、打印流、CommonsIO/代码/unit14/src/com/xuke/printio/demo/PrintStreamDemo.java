package com.xuke.printio.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) throws IOException {
		//
		String ss="test";
		//加载字符串
		PrintStream out = System.out;
		out.println(ss);
		
		//输出流
		PrintStream pst=new PrintStream("jdbc2.txt");
		//打印出字符串
		pst.println("dddd111");
		pst.write("kdkfs".getBytes());
		pst.flush();
		//关闭
		pst.close();

	}

}
