package com.zhiyou.javase.net.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class SendMsgThread implements Runnable {

	private Socket sk;

	public SendMsgThread(Socket sk) {
		this.sk = sk;
	}

	@Override
	public void run() {
		// 发送信息
		// 1、获取键盘输入的信息
		InputStream ist = System.in;
		try {
			BufferedReader bfr = new BufferedReader(new InputStreamReader(ist, "UTF-8"));
			String line = null;
			// 2、把键盘输入的信息，输出
			PrintWriter pw = new PrintWriter(sk.getOutputStream());
			while ((line = bfr.readLine()) != null) {
				pw.println(line);
				pw.flush();
			}

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
