package com.xuke.exception.demo;

public class TestArrayTool2 {

	public static void main(String[] args) {
		String[] s= {"a","b","c","d"};
		ArrayTools aTool=new ArrayTools();
		String temp=null;
		//推荐这么写
		try {
			//可能发生异常的代码放在这里
			//这里定义的变量，作用域只在try{}中
			temp=aTool.get(s, 7);
			System.out.println("111111");
		}catch(Exception e) {
			//处理异常的地方
			System.out.println(e.getMessage());
			throw e;
		}finally {
			//不管上面有没有异常，最终都会执行的代码
			System.out.println("finally");
		}
		System.out.println("ooooo");
	}

}
