package com.xuke.fileuri.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetHttpImgDemo {

	public static void main(String[] args) throws Exception{
		//new一个URL对象  
        URL url = new URL("https://i8.mifile.cn/b2c-mimall-media/5ae79007d447eb23f6944abd722a8961.jpg");  
        //打开链接  
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();  
        //设置请求方式为"GET"  
        conn.setRequestMethod("GET");  
        //超时响应时间为5秒  
        conn.setConnectTimeout(5 * 1000);  
        //通过输入流获取图片数据  
        InputStream inStream = conn.getInputStream();  
        //图片是以二进制数据进行保存  
        byte[] bt=new byte[1024];
		int len=0;
        //new一个文件对象用来保存图片，默认保存当前工程根目录  
        File imageFile = new File("t.jpg");  
        //创建输出流  
        FileOutputStream outStream = new FileOutputStream(imageFile); 
        while((len=inStream.read(bt))!=-1) {
        	outStream.write(bt, 0, len);
		}
        //关闭流  
        inStream.close();
        outStream.close();  
	}

}
