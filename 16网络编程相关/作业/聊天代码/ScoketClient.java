package com.zhiyou.javase.net.five;

import java.io.IOException;
import java.net.Socket;

public class ScoketClient {

	public static void main(String[] args) throws IOException {
		Socket sk = new Socket("127.0.0.1", 8888);

		ReciveMsgThread rmt = new ReciveMsgThread(sk);
		SendMsgThread smt = new SendMsgThread(sk);

		new Thread(rmt, "接收服务端的信息").start();
		new Thread(smt, "向服务端发送信息").start();
	}

}
