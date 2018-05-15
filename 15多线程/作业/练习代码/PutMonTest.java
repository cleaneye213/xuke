package com.zhiyou.javase.thread.one;

/**
 * 存钱线程
 * 
 * @author Administrator
 *
 */
public class PutMonTest extends Thread {

	private Account account;

	private double money;

	public PutMonTest() {

	}

	public PutMonTest(String name, Account account, double money) {
		super(name);
		this.account = account;
		this.money = money;
	}

	public void run() {
		// 模拟重复存钱的动作
		for (int i = 0; i < 50; i++) {
			account.putMoney(money);
		}
	}

}
