package com.xuke.io.demo1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException{
		//1 创建流的对象
		OutputStream out=new FileOutputStream("D:\\file\\gg.txt");
		OutputStreamWriter ouw=new OutputStreamWriter(out);
		//2 把字符串写入
		ouw.write("测试转换流");
		//刷新流
		ouw.flush();
		//3 关闭流
		out.close();
		ouw.close();
	}
}
