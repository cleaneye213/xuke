package com.xuke.test.demo;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class TestFilterFileDemo3 {

	public static void main(String[] args) {
		// 使用将指定文件夹下的小于200K的小文件获取并打印
		String path="C:\\Users\\Dell\\Pictures";
		List<File> fileList=new ArrayList<>();
		getJavaFile(path,fileList);
		for (File file : fileList) {
			System.out.println(file.getPath());
		}
	}

	//遍历指定的文件夹
	public static void getJavaFile(String path,List<File> list) {
		if(list==null) {
			list=new ArrayList<>();
		}
		//判断是否是文件夹
		File file=new File(path);
		if(!file.exists()) {
			file.mkdirs();
		}
		//遍历所有的文件
		File[] listFile=file.listFiles();
		for (File temp : listFile) {
			if(temp.isDirectory()) {
				getJavaFile(temp.getPath(),list);
			}else {
				//判断是否是java后缀名
				//200KB-->字节=200*(1024B)->200*(1024*8)
				if(temp.length()<=(200*1024)) {
					System.out.println(temp.length());
					list.add(temp);
				}
			}
		}
	}
}
