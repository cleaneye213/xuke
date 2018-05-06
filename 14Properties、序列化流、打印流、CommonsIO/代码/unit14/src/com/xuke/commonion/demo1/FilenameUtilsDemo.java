package com.xuke.commonion.demo1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;

public class FilenameUtilsDemo {

	public static void main(String[] args) {
		//FilenameUtils工具类
		//获取文件名，扩展名
		String extension = FilenameUtils.getExtension("jdbc3.xml.txt");
		System.out.println(extension);
		
		//
		File file=new File("jdbc3.xml.txt");
		System.out.println(file.getName());
		//截取字符串....
		
		//判断某个文件是否是以后缀.xls结尾
		List<String> list=new ArrayList<>();
		list.add("txt");
		list.add("xls");
		list.add("xml");
		boolean flg = FilenameUtils.isExtension("jdbc3.xml.txt", list);
		System.out.println(flg);
	}

}
