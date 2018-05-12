package com.xuke.thread.demo3;

public class MyInnerThreadTest {

	public static void main(String[] args) {
		//测试匿名内部线程类
		Thread t1=new Thread("匿名线程类1") {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println(this.getName()+":"+i);
				}
			}
		};
		Thread t2=new Thread("匿名线程类2") {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println(this.getName()+":"+i);
				}
			}
		};
		t1.start();
		t2.start();
		//创建一个实现了Runnable接口的线程类
		Thread t3=new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
			
		},"实现接口的线程类3");
		t3.start();
	}

}
