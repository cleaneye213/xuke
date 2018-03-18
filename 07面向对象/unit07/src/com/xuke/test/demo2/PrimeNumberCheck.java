package com.xuke.test.demo2;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		//判断一个数是否是一个素数
		//分析
		/*
		 * 1、什么是素数
		 *     只能是被1和本身整除的才叫素数。
		 *     3/1=3,3/3=1;
		 *     3/(>3)不能整除
		 *     3/0（分母不能为0）无需判断
		 *     3/(1<num<3)  如果能整除就不是素数
		 * 不能为负数
		 * */
		
		int temp=100;
		PrimeNumberCheck pck=new PrimeNumberCheck();
		pck.checkPrimeNum(temp);
		
	}

	public void checkPrimeNum(int temp) {
		if(temp<=0) {
			System.out.println("不能输入小于0的数");
			//break;//不能用在这里，用来中断循环
			//continue;//不能用在这里，用来跳过当前循环，继续后续的循环
		}else {
			boolean flag=true;
			for(int i=2;i<temp;i++) {
				//判断规则temp/i能不能整除
				if(temp%i==0) {
					//不是素数
					flag=false;
					break;
				}
			}
			
			if(flag) {
				System.out.println("这个数"+temp+"是素数");
			}else {
				System.out.println("这个数"+temp+"不是素数");
			}
		}
		
		
		
	}
}
