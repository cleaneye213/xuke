package com.xuke.thread.demo2;

public class MyThreadRunable implements Runnable {

	@Override
	public void run() {
		//
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}

}
