package com.xuke.net.demo4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServiceDemo {

	public static void main(String[] args) throws IOException {
		// 服务端先启动
		ServerSocket ssk=new ServerSocket(8888);
		
		//接收客户端连接
		Socket accept = ssk.accept();
		//发送服务器欢迎信息
		OutputStream out = accept.getOutputStream();
		PrintWriter pwt=new PrintWriter(out);
		pwt.write("欢迎你："+accept.getInetAddress().getHostName());
		pwt.flush();
		
		//接收客户端返回的信息
		InputStream inst = accept.getInputStream();
		byte[] bt=new byte[1024];
		int len=0;
		while((len=inst.read(bt))!=-1) {
			System.out.println(new String(bt,0,len));
		}
	}

}
