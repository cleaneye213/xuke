package com.xuke.exception.demo;

public class TestArrayTool4 {

	public static void main(String[] args) {
		String[] s= {"a","b","c","d"};
		ArrayTools aTool=new ArrayTools();
		String temp=null;
		//针对不同异常，进行不同的业务处理，按顺序进行比较处理
		//如果找到该异常的处理，catch，执行完catch里的代码后，就执行finally的代码
		//不会再执行其他的异常。
		//多个catch里的异常，必须从小到大排序
		try {
			//可能发生异常的代码放在这里
			//这里定义的变量，作用域只在try{}中
			temp=aTool.get(null, 7);
			System.out.println("111111");
		}catch(NullPointerException e){
			System.out.println("请传数组");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("索引越界");
			e.printStackTrace();
		}finally {
			//不管上面有没有异常，最终都会执行的代码
			System.out.println("finally");
		}
		System.out.println("ooooo"+temp);
	}

}
