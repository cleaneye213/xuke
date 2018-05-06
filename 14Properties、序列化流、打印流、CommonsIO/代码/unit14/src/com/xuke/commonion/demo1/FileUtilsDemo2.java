package com.xuke.commonion.demo1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileUtilsDemo2 {

	public static void main(String[] args) throws IOException{
		//与文件操作相关的方法(复制、删除、获取文件、挪到、读写文件)
		//复制文件
		/**
		 * srcFile源文件,destFile目的地文件
		 */
		FileUtils.copyFile(new File("test3.txt"), new File("test4.txt"));
		
	}

}
