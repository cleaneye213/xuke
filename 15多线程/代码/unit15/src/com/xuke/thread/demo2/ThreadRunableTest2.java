package com.xuke.thread.demo2;

public class ThreadRunableTest2 {

	public static void main(String[] args) {
		// 测试实现Runnale接口的类
		//多线程
		MyThreadRunable r1=new MyThreadRunable();
		MyThreadRunable r2=new MyThreadRunable();
		Thread t1=new Thread(r1,"线程1");
		Thread t2=new Thread(r1,"线程2");
		Thread t3=new Thread(r1,"线程3");
		
		//启动线程
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(Thread.currentThread().getName());
	}

}


