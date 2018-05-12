package com.xuke.fileuri.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class GetHttpImgDemo2 {

	public static void main(String[] args) {
		FileOutputStream outStream = null;
		try {
			URL url = new URL("https://i8.mifile.cn/b2c-mimall-media/5ae79007d447eb23f6944abd722a8961.jpg");
			InputStream in = url.openStream();
			byte[] bt = new byte[1024];
			int len = 0;
			File imageFile = new File("t2.jpg");
			// 创建输出流
			outStream = new FileOutputStream(imageFile);
			while ((len = in.read(bt)) != -1) {
				outStream.write(bt, 0, len);
			}
		} catch (IOException ex) {
			System.out.println(ex);
		} finally {
			try {
				outStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
