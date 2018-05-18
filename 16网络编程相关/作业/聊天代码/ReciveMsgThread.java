package com.zhiyou.javase.net.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReciveMsgThread implements Runnable {
	private Socket sk;

	public ReciveMsgThread(Socket sk) {
		this.sk = sk;
	}

	@Override
	public void run() {
		// 读取socket输入流
		try {
			InputStream ist = sk.getInputStream();
			BufferedReader bfr = new BufferedReader(new InputStreamReader(ist, "UTF-8"));
			String line = null;
			// InetAddress ip = null;
			while ((line = bfr.readLine()) != null) {
				// ip = sk.getInetAddress();
				System.out.println(line);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
