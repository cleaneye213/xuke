package com.xuke.io.demo3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException{
		BufferedReader brd=new BufferedReader(new FileReader("D:\\file\\g2.txt"));
		
		char[] ch=new char[1024];
		int len=0;
		while((len=brd.read(ch))!=-1) {
			System.out.println(new String(ch,0,len));
		}
		
		brd.close();
	}

}
