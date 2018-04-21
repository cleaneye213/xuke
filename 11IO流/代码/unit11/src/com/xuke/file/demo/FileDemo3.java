package com.xuke.file.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileDemo3 {

	public static void main(String[] args) {
		// 获取文件夹下的所有文件
		//D:\work_th\idea\mydemo
		FileDemo3.getFilesByPath("D:\\work_th\\idea\\mydemo");
	}

	public static List<File> getFilesByPath(String path){
		if(path==null || "".equals(path)) {
			return null;
		}
		File dirFile=new File(path);
		List<File> list=null;
		if(dirFile.exists() && dirFile.isDirectory()) {
			list=new ArrayList<>();
			String[] filer = dirFile.list();
			for (String filName : filer) {
				list.add(new File(path+File.separator+filName));
			}
			System.out.println(Arrays.toString(filer));
		}
		if(list!=null) {
			for (File file : list) {
				System.out.println(file.getPath()+"==="+file.getName());
			}
		}
		return null;
	}
}
