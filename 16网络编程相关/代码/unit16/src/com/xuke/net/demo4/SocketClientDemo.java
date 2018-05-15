package com.xuke.net.demo4;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//客户端
		//创建socke，连接到服务端
		Socket sk=new Socket("127.0.0.1", 8888);
		//先接受服务端发送的欢迎信息打印到控制台
		InputStream inStm = sk.getInputStream();
		byte[] bt=new byte[1024];
		int len=0;
		while((len=inStm.read(bt))!=-1) {
			System.out.println(new String(bt,0,len));
		}
		
		//发送连接成功的信息给服务端
		BufferedOutputStream bf=new BufferedOutputStream(sk.getOutputStream());
		PrintWriter pwt=new PrintWriter(bf);
		pwt.write("连接成功！");
		pwt.flush();
		
		//关闭socket
	}

}
