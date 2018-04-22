package com.xuke.test.demo;

import java.io.File;
import java.io.FilenameFilter;

public class TestFilterFileDemo2 {

	public static void main(String[] args) {
		// 使用文件名称过滤器筛选将指定文件夹下的.java的文件获取并打印路径
		String path="F:\\workHaiSiP2P_nc\\unit12\\src\\com\\xuke\\filereader\\demo";
		File file=new File(path);
		File[] list = file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				if(name.lastIndexOf(".java")>-1) {
					return true;
				}
				return false;
			}
		});
		for (File temp : list) {
			System.out.println(temp.getPath());
		}
		
	}

	//遍历指定的文件夹
	public void getJavaFile() {
		
		
	}
}
