package com.xuke.commonion.demo1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class FileUtilsDemo3 {

	public static void main(String[] args) throws IOException{
		//与文件操作相关的方法(复制、删除、获取文件、挪到、读写文件)
		//复制文件
		/**
		 * srcFile源文件,destFile目的地文件,filter过滤
		 */
		//复制文件夹(包含子文件夹)
		//复制unit14中所有的java文件
		//1、源文件夹
		File srcDir=new File("F:\\workHaiSiP2P_nc\\unit14\\src\\com\\xuke\\commonion\\demo1");
		//2、目的地文件夹
		File destDir=new File("F:\\unit14");
		//3、创建过滤对象
		//只复制文件夹下的文件，不包含子文件夹里的文件
		FileUtils.copyDirectory(srcDir, destDir, new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				//后缀名为java的文件
				if(FilenameUtils.isExtension(pathname.getName(), "java")) {
					return true;
				}
				return false;
			}
		});
		
		FileUtils.copyDirectoryToDirectory(new File("F:\\workHaiSiP2P_nc\\unit14"), new File("F:\\unit15"));
	}

}
