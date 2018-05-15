package com.zhiyou.javase.thread.one;

public class Account {
	// 两个线程，取钱线程和存钱线程，要求存款者和取钱者不断的重复存款和取钱
	// 要求当存款者将钱存入指定账户时，取款者就立即把钱取出，
	// 不允许存款者重复存款，也不允许取钱者重复取钱

	private String accountNo;
	private double balance;

	// 用来标识：false表示账户没有钱，请存钱;true表示账户有钱，把钱取走
	private boolean flag = false;

	public Account() {
	};

	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	// 取钱方法
	public synchronized void draw(double money) {
		if (!flag) {
			// 表示没钱，需等待存款者存钱
			try {
				this.wait();// 等待存款线程，进行存钱
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			// flag--true
			System.out.println("账户有钱，可以取钱:" + money);
			this.balance -= money;// 扣除余额
			this.flag = false;
			System.out.println("账户余额为：" + this.getBalance());
			// 唤醒其他线程（存钱线程）
			this.notifyAll();
			System.out.println("==========");
		}
	}

	// 存钱方法
	public synchronized void putMoney(double money) {
		if (!flag) {
			// 存钱
			System.out.println("可以进行存钱：" + money);
			this.balance += money;
			this.flag = true;
			System.out.println("账号余额：" + this.getBalance());
			this.notify();// 唤醒取款者，取钱
			System.out.println("==========");
		} else {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	// 不允许随便更改余额，必须通过存钱、取钱方法进行修改
	// public void setBalance(double balance) {
	// this.balance = balance;
	// }

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
