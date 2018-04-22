package com.xuke.Input.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo5 {

	public static void main(String[] args) throws IOException {
		//
		String name="D:\\file2\\a.txt";
		File file=new File(name);
		FileInputStream input=new FileInputStream(new File("D:\\file2\\a.txt"));
		//字节数组进行读取，效率比较高
		byte[] bt=new byte[6]; 
		int read =0;
		while((read = input.read(bt))!=-1) {
			//这次读取的具体多少字节数
			System.out.println(read);
			System.out.println(new String(bt,0,read));
		}
		
		//D:\\file2\\a.txt copy 到 D:\\file2\\b.txt
		
	}

}
