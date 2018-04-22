package com.xuke.output.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// 往d:\\file\a.txt写abcd123456
		//1、用输出流--》字节流   
		//2 OutputStream
		//System.in/out
		File file=new File("d:\\file2");
		if(!file.exists()) {
			//注意：file不要包含文件名称，mkdirs会把她当成文件夹名称
			file.mkdirs();
		}
		File newfile=new File(file,"a.txt");
		//file的文件夹路径必须存在。文件名称可以不存在，会自动创建文件。
		//new FileOutputStream(newfile)会覆盖里面的内容
		FileOutputStream fileOut=new FileOutputStream(newfile);
		//String str="abcd123456";
		
		//a-->97  字符对应的ascii值
		fileOut.write(97);
		fileOut.close();
	}

}
