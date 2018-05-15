package com.zhiyou.javase.thread.one;

/**
 * 取钱线程
 * 
 * @author Administrator
 *
 */
public class DrawMonTest extends Thread {

	private Account account;

	private double money;

	public DrawMonTest() {

	}

	public DrawMonTest(String name, Account account, double money) {
		super(name);// 设置线程的名称
		this.account = account;
		this.money = money;
	}

	public void run() {
		// 模拟重复取钱的动作
		for (int i = 0; i < 50; i++) {
			account.draw(money);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
