package com.xuke.commonion.demo1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileUtilsDemo {

	public static void main(String[] args) throws IOException{
		//与文件操作相关的方法(复制、删除、获取文件、挪到、读写文件)
		//读文件
		//FileUtils.readToString(file)
		List<String> readLines = FileUtils.readLines(new File("test.txt"));
		for(String temp:readLines) {
			System.out.println(temp);
		}
		//写文件
		FileUtils.writeLines(new File("test3.txt"), readLines);
		

	}

}
