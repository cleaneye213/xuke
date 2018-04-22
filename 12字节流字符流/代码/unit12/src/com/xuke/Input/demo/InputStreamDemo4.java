package com.xuke.Input.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo4 {

	public static void main(String[] args) throws IOException {
		//
		String name="D:\\file2\\a.txt";
		File file=new File(name);
		FileInputStream input=new FileInputStream(new File("D:\\file2\\a.txt"));
		//字节数组进行读取，效率比较高
		byte[] bt=new byte[512]; 
		int read=input.read(bt);
		System.out.println(new String(bt));
	}

}
