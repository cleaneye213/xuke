package com.xuke.thread.demo1;

public class MyThread extends Thread{
	
	private String name;
	
	public MyThread(String name) {
		this.name=name;
	}

	@Override
	public void run() {
		//线程的运行状态
		//线程的运行的方法体：
		//线程要做的业务逻辑写在这里
		//设置线程的名称
		this.setName(name);
		System.out.println("这是新线程");
		System.out.println(Thread.currentThread().getName());
		//System.out.println(this.getName());
	}
}
