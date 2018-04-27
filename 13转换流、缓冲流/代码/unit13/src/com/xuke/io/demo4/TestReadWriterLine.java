package com.xuke.io.demo4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReadWriterLine {

	public static void main(String[] args) throws IOException{
		//
		BufferedWriter rfw=new BufferedWriter(new FileWriter("D:\\file\\tt.txt"));
		for(int i=0;i<10;i++) {
			rfw.write("是大富大贵的三个"+i+"\r\n");
		}
		rfw.flush();
		rfw.close();
		
		//读取信息
		BufferedReader brd=new BufferedReader(new FileReader("D:\\file\\tt.txt"));
		String temp=null;
		while((temp=brd.readLine())!=null) {
			System.out.println(temp);
		}
		brd.close();
	}

}
