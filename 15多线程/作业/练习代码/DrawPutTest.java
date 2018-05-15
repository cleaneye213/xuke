package com.zhiyou.javase.thread.one;

public class DrawPutTest {

	public static void main(String[] args) {
		Account act = new Account("123243465", 0.0);

		new DrawMonTest("取钱者", act, 800).start();
		new PutMonTest("存钱者甲", act, 800).start();
		new PutMonTest("存钱者乙", act, 800).start();
	}

}
