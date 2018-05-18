package com.zhiyou.javase.net.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

/**
 * 转发客户端发送的信息，给所有客户端
 * 
 * @author Administrator
 *
 */
public class ReSendMsgTClient implements Runnable {

	private Socket sk;

	public ReSendMsgTClient(Socket sk) {
		this.sk = sk;
	}

	@Override
	public void run() {
		// 读取信息
		InputStream ist;
		try {
			ist = sk.getInputStream();
			BufferedReader bfr = new BufferedReader(new InputStreamReader(ist, "UTF-8"));
			String line = null;
			PrintWriter pwt = null;

			String time = null;
			String ipStr = null;
			while ((line = bfr.readLine()) != null) {
				time = (new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
				ipStr = String.valueOf(sk.getInetAddress());
				// 截取ipStr前的/
				if (ipStr != null && ipStr.startsWith("/")) {
					ipStr = ipStr.substring(1, ipStr.length());
				}
				if ("null".equals(ipStr)) {
					ipStr = "";
				}

				// 遍历Socket集合，将读取到的信息发送给每个socket
				for (Socket temp : ScoketServer.sList) {
					pwt = new PrintWriter(temp.getOutputStream());
					pwt.println(ipStr + " " + time + "：" + line);
					pwt.flush();
				}
				System.out.println(ipStr + " " + time + "：" + line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
