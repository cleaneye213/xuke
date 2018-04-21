package com.xuke.file.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\file4");
		//创建文件夹，会把待有文件名的file当成文件夹来创建
		file.mkdirs();
		File file2=new File(file, "bb.txt");
		System.out.println(file.getName());
		//创建文件
		boolean createNewFile = file2.createNewFile();
	}

}
