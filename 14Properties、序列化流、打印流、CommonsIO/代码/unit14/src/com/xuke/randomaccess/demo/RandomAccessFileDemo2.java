package com.xuke.randomaccess.demo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;

public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws IOException{
		//从某个文件的某个文件进行插入字符串
		//思路：
		//1、把要插入位置后面的内容存放到临时文件中
		//2、在指定文章插入新增内容
		//3、把临时文件的内容添加到更新后的文件中去
		//4、删除临时文件
		
		//代码实现
		//1、创建临时文件来存放指定位置后的内容
		File temp=new File("temp.txt");
		//退出程序后自动删除文件
		temp.deleteOnExit();
		//2、读取指定位置后的内容，并写到临时文件
		RandomAccessFile raf=new RandomAccessFile(new File("test5.txt"), "rw");
		raf.seek(4);
		byte[] bt=new byte[2];
		int len=0;
		
		RandomAccessFile rafTemp=new RandomAccessFile(temp,"rw");
		while((len=raf.read(bt))!=-1) {
			//写入临时文件中
			rafTemp.write(bt,0,len);
		}
		
		//3、插入数据
		raf.seek(4);
		raf.write("yyyy".getBytes());
		
		//4、把临时文件中的内容写到test5.txt中
		len=0;
		//指针重新复位到temp.txt的头部开始读取内容
		rafTemp.seek(0);
		while((len=(rafTemp.read(bt)))!=-1) {
			raf.write(bt,0,len);
		}
		//关闭流
		raf.close();
		rafTemp.close();

	}

}
