package com.xuke.io.demo3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException{
		// 1
		BufferedWriter bwt=new BufferedWriter(new FileWriter("D:\\file\\g2.xls"));
		
		//2
		bwt.write("中华人民共和国".toCharArray());
		
		//3关闭
		bwt.close();
		
	}

}
