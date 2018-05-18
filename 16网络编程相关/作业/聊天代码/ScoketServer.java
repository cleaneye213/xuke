package com.zhiyou.javase.net.five;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoketServer {

	public static List<Socket> sList = Collections.synchronizedList(new ArrayList<>());

	public static void main(String[] args) throws IOException {
		// 创建一个serverscoker，用于监听客户端socket的连接
		ServerSocket ssk = new ServerSocket(8888);
		// 需要不断的监听客户端信息
		ReciveMsgThread rmt = null;
		SendMsgThread smt = null;
		ReSendMsgTClient rsmt = null;
		while (true) {
			Socket accept = ssk.accept();
			sList.add(accept);

			for (Socket sk : sList) {
				rmt = new ReciveMsgThread(sk);
				smt = new SendMsgThread(sk);
				rsmt = new ReSendMsgTClient(sk);
				// new Thread(rmt, "接收客户端的信息").start();
				new Thread(rsmt, "接收客户端的信息并发送给其他客户端").start();
				new Thread(smt, "向客户端发送信息").start();
			}
		}
	}

}
