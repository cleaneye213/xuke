package com.xuke.demo2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		//1 创建流对象
		OutputStream out=new FileOutputStream("D:\\file\\gg.txt");
		BufferedOutputStream bos=new BufferedOutputStream(out);
		
		//2写数据
		bos.write("中华人民共和国".getBytes());
		
		//3关闭流
		bos.close();

	}

}
