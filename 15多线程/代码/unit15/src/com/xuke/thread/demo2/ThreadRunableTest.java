package com.xuke.thread.demo2;

public class ThreadRunableTest {

	public static void main(String[] args) {
		// 测试实现Runnale接口的类
		//普通方法调用 begin
		MyThreadRunable r1=new MyThreadRunable();
		r1.run();

		
		MyThreadRunable r2=new MyThreadRunable();
		r2.run();
		//普通方法调用 end
	}

}


