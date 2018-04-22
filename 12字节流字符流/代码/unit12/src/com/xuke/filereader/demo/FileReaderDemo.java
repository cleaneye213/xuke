package com.xuke.filereader.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		//读取文件信息
		String fileA="D:\\file2\\a.txt";
		//忽略文件路径不存在的判断
		File file=new File(fileA);
		FileReader fileReader=null;
		try {
			fileReader = new FileReader(file);
			//读取文件信息
			int read = 0;
			while((read=fileReader.read())!=-1) {
				System.out.println((char)read);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//关闭IO流
			try {
				if(fileReader!=null) {
					fileReader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
	}

}
