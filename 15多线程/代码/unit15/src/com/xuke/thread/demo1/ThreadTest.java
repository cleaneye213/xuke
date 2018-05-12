package com.xuke.thread.demo1;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		// 测试Thread
		Thread.currentThread().setName("主线程main");
		System.out.println("线程的ID:"+Thread.currentThread().getId()+"，线程名称："+Thread.currentThread().getName());
		
		//调用线程
		//创建线程
		MyThread t1=new MyThread("aaa");
		//启动线程--》线程进入就绪状态-->自动运行run方法(业务)
		t1.start();
		
		MyThread t2=new MyThread("bbb");
		//启动线程--》线程进入就绪状态-->自动运行run方法(业务)
		t2.start();
		
		//Thread.currentThread().sleep(10*1000);
		
		MyThread t3=new MyThread("ccc");
		//启动线程--》线程进入就绪状态-->自动运行run方法(业务)
		t3.start();
		
		
		//Thread.currentThread().sleep(10*1000);
		System.out.println("main主线程");
	}

}
