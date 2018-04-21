package com.xuke.file.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\file4", "bb.txt");
		//创建文件夹，会把待有文件名的file当成文件夹来创建
		//file.mkdirs();
		System.out.println(file.getName());
		//创建文件
		boolean createNewFile = file.createNewFile();
	}

}
