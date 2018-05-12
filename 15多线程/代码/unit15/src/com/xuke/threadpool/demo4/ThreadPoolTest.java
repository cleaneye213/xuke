package com.xuke.threadpool.demo4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {
		// 线程池
		//创建线程池
		//通过线程工厂类来生成
		//可重用的线程池
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		
		//创建线程,并运行线程start->run
		threadPool.submit(new MyThreadRun2());
		threadPool.submit(new MyThreadRun2());
		threadPool.submit(new MyThreadRun2());
		threadPool.submit(new MyThreadRun2());
		//注意：submit方法调用结束后，程序并不终止，是因为线程池控制了线程的关闭。将使用完的线程又归还到了线程池中
		
		//关闭线程池
		threadPool.shutdown();
	}

}

class MyThreadRun2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}