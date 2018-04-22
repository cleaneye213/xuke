package com.xuke.copyfile.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		String fileA="D:\\file2\\a.txt";
		String fileB="D:\\file2\\b.txt";
		
		
		System.out.println(copyFile(fileA,fileB));
		
		readTextByAry(fileA);
	}
	
	//读取文件
	public static void readTextByOne(String path1) throws IOException {
		FileInputStream intStrem=null;
		//读取fileA
		intStrem=new FileInputStream(new File(path1));
		//用字节数组
		int read=0;
		while((read=intStrem.read())!=-1) {
			System.out.println((char)read);
		}
		intStrem.close();
	}
	
	//读取文件
		public static void readTextByAry(String path1) throws IOException {
			FileInputStream intStrem=null;
			//读取fileA
			intStrem=new FileInputStream(new File(path1));
			//用字节数组
			byte[] bt=new byte[1024];
			int read=0;
			while((read=intStrem.read(bt))!=-1) {
				System.out.println(new String(bt,0,read,"GBK"));
			}
			intStrem.close();
		}

	//提取成方法（复制文件）
	@SuppressWarnings("finally")
	public static boolean copyFile(String path1,String path2) {
		FileInputStream intStrem=null;
		FileOutputStream outStream=null;
		boolean flag=false;
		try {
			//先读取fileA
			intStrem=new FileInputStream(new File(path1));
			outStream=new FileOutputStream(new File(path2));
			//用字节数组
			byte[] bt=new byte[1024];
			int read=0;
			while((read=intStrem.read(bt))!=-1) {
				//写到新到的文件中去
				//边读边写入fileB
				outStream.write(bt, 0, read);
			}
			flag=true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//必须要关闭IO流
			if(intStrem!=null) {
				try {
					intStrem.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(outStream!=null) {
				try {
					outStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return flag;
		}
	}
}
