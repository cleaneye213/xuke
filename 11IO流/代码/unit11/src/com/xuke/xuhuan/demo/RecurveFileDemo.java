package com.xuke.xuhuan.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RecurveFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<File> fileList=new ArrayList<>();
		//getAllFileByPath("D:\\file4",fileList);
		getAllFileByPath3("D:\\idea_linewell01",fileList);
		for (File file : fileList) {
			System.out.println(file.getPath());
		}
	}
	
	//有问题的递归
	public static List<File> getAllFileByPath(String path,List<File> arrayList){
		if(arrayList==null) {
			arrayList=new ArrayList<>();
		}
		
		File file=new File(path);
		if(file.isFile()) {
			arrayList.add(file);
			return arrayList;
		}else {
			File[] listFiles = file.listFiles();
			if(listFiles!=null) {
				for (File temp : listFiles) {
					if(temp.isFile()) {
						arrayList.add(temp);
						return arrayList;
					}else {
						return getAllFileByPath(path+File.separator+temp.getName(),arrayList);
					}
				}
			}
			//listFiles为空的话
			return arrayList;
		}
	}
	
	//有问题的递归
	public static void getAllFileByPath2(String path,List<File> arrayList){
		if(arrayList==null) {
			arrayList=new ArrayList<>();
		}
		
		File file=new File(path);
		if(file.isFile()) {
			arrayList.add(file);//如果path就是一个文件，就直接中断了。
		}else {
			File[] listFiles = file.listFiles();
			if(listFiles!=null) {
				for (File temp : listFiles) {
					if(temp.isFile()) {
						arrayList.add(temp);
					}else {
						getAllFileByPath(path+File.separator+temp.getName(),arrayList);
					}
				}
			}
		}
	}
	
	
	public static void getAllFileByPath3(String path,List<File> arrayList){
		if(arrayList==null) {
			arrayList=new ArrayList<>();
		}
		
		File file=new File(path);
		File[] listFiles = file.listFiles();
		for(File temp : listFiles) {
			if(temp.isDirectory()) {
				getAllFileByPath3(temp.getPath(),arrayList);
			}else {
				arrayList.add(temp);//如果path就是一个文件，就直接中断了。
			}
		}
	}
}
