package com.xuke.xuhuan.demo;

public class RecurveDemo {

	public static void main(String[] args) {
		//计算1.n累加只（1+2+3+4....+n）
		//用递归方式实现
		//方法的本身调用本身
		//如果没有中断，就是死循环，所以必须要有终止的结束条件
		//n+(n-1)+(n-2)+....+1
		int num=100;
		System.out.println(getCount(num));
	}

	
	public static int getCount(int num) {
		if(num==1) {
			return 1;
		}else {
			return num+getCount(num-1);
		}
	}
	
}
