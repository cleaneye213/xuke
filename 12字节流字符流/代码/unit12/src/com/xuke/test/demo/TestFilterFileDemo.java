package com.xuke.test.demo;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class TestFilterFileDemo {

	public static void main(String[] args) {
		// 使用文件名称过滤器筛选将指定文件夹下的.java的文件获取并打印路径
		String path="F:\\workHaiSiP2P_nc\\unit12";
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
				if(temp.getName().lastIndexOf(".java")>-1) {
					list.add(temp);
				}
			}
		}
	}
}
