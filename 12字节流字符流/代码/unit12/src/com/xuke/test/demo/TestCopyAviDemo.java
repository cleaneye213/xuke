package com.xuke.test.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyAviDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="C:\\Program Files (x86)\\KKcapture\\Movies\\kk 2018-03-22 19-11-56.avi";
		String path2="d:\\file2\\a.avi";
		long start=System.currentTimeMillis();
		//copyFileByOne(path1,path2);
		copyFileByAry(path1,path2);
		long end=System.currentTimeMillis();
		System.out.println((end-start));
	}

	// 提取成方法（复制文件）
	@SuppressWarnings("finally")
	public static boolean copyFileByAry(String path1, String path2) {
		FileInputStream intStrem = null;
		FileOutputStream outStream = null;
		boolean flag = false;
		try {
			// 先读取fileA
			intStrem = new FileInputStream(new File(path1));
			outStream = new FileOutputStream(new File(path2));
			// 用字节数组
			byte[] bt = new byte[1024];
			int read = 0;
			while ((read = intStrem.read(bt)) != -1) {
				// 写到新到的文件中去
				// 边读边写入fileB
				outStream.write(bt, 0, read);
			}
			flag = true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 必须要关闭IO流
			if (intStrem != null) {
				try {
					intStrem.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (outStream != null) {
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
	
	// 提取成方法（复制文件）
		@SuppressWarnings("finally")
		public static boolean copyFileByOne(String path1, String path2) {
			FileInputStream intStrem = null;
			FileOutputStream outStream = null;
			boolean flag = false;
			try {
				// 先读取fileA
				intStrem = new FileInputStream(new File(path1));
				outStream = new FileOutputStream(new File(path2));
				// 用字节数组
				int read = 0;
				while ((read = intStrem.read()) != -1) {
					// 写到新到的文件中去
					// 边读边写入fileB
					outStream.write(read);
				}
				flag = true;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				// 必须要关闭IO流
				if (intStrem != null) {
					try {
						intStrem.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (outStream != null) {
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
