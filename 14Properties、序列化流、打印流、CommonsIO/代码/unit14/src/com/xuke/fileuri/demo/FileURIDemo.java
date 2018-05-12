package com.xuke.fileuri.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class FileURIDemo {

	public static void main(String[] args) throws IOException, URISyntaxException{
		//复制网络中的图片
		//https://i8.mifile.cn/b2c-mimall-media/5ae79007d447eb23f6944abd722a8961.jpg
		URL url=new URL("https://i8.mifile.cn/b2c-mimall-media/5ae79007d447eb23f6944abd722a8961.jpg");
		
		File file=new File(url.toURI());
		
		//创建流对象
		FileInputStream fis=new FileInputStream(file);
		
		FileOutputStream fos=new FileOutputStream(new File("8.png"));
		byte[] bt=new byte[1024];
		int len=0;
		while((len=fis.read(bt))!=-1) {
			fos.write(bt, 0, len);
		}
		
		//关闭流
		fis.close();
		fos.close();
	}

}
