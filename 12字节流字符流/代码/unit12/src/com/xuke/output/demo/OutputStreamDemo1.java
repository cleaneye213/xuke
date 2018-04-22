package com.xuke.output.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo1 {

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
		//new FileOutputStream(newfile,true)会把新的内容追加
		//到原本文件的内容后面
		FileOutputStream fileOut=new FileOutputStream(newfile,true);
		String str="abcd123456";
		//字符串转成字节数组
		//换行追加内容
		fileOut.write(("\n"+str).getBytes());
		fileOut.close();
	}

}
