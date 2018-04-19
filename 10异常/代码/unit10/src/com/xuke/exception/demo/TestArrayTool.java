package com.xuke.exception.demo;

public class TestArrayTool {

	public static void main(String[] args) {
		String[] s= {"a","b","c","d"};
		ArrayTools aTool=new ArrayTools();
		String temp=null;
		try {
			//可能发生异常的代码放在这里
			//这里定义的变量，作用域只在try{}中
			temp=aTool.get(s, 7);
		}catch(Exception e) {
			//处理异常的地方
			System.out.println(e.getMessage());
		}
		
		System.out.println(temp);
	}

}
