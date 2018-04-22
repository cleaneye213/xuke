package com.xuke.Input.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		//
		String name="D:\\file2\\a.txt";
		File file=new File(name);
		FileInputStream input=new FileInputStream(new File("D:\\file2\\a.txt"));
		//一个个字节进行读取
		int i=0;
		while(i!=-1) {
			//如果read是-1的话，表示文件没有内容了，可以结束读取
			i=input.read();
			System.out.println((char)i);
		}
	}

}
