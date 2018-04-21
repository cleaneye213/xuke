package com.xuke.file.demo;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		//1 通过整串的文件路径来实例化对象
		//http://web/\test\java说明.txt
		File file=new File("D:\\file\\ddd.txt");//文件夹
		System.out.println("这里没有报错");
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println("这里没有报错");
		System.out.println(file.getTotalSpace());
		
		System.out.println("========================");
		File file2=new File("但事实上");
		System.out.println(file2.getName());
		//传字符串时，new File都不报错。
		//为了后续代码的健壮性考虑，需要判断文件是否存在
		if(file.exists()) {
			//业务动作
			System.out.println("1111");
		}else {
			//根据路径创建一个新的文件（空的文件）
			//file.mkdir();
			file.mkdirs();
		}
	}

}
