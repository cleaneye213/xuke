package com.xuke.xuhuan.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RecurveFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<File> fileList=new ArrayList<>();
		//getAllFileByPath("D:\\file4",fileList);
		getAllFileByPath2("D:\\file4",fileList);
		for (File file : fileList) {
			System.out.println(file.getPath());
		}
	}

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
				for (File file2 : listFiles) {
					if(file2.isFile()) {
						arrayList.add(file2);
						return arrayList;
					}else {
						return getAllFileByPath(path+File.separator+file2.getName(),arrayList);
					}
				}
			}
			//listFiles为空的话
			return arrayList;
		}
	}
	
	public static void getAllFileByPath2(String path,List<File> arrayList){
		if(arrayList==null) {
			arrayList=new ArrayList<>();
		}
		
		File file=new File(path);
		if(file.isFile()) {
			arrayList.add(file);
		}else {
			File[] listFiles = file.listFiles();
			if(listFiles!=null) {
				for (File file2 : listFiles) {
					if(file2.isFile()) {
						arrayList.add(file2);
					}else {
						getAllFileByPath(path+File.separator+file2.getName(),arrayList);
					}
				}
			}
		}
	}
}
