package com.xuke.unit.test2;

import com.xuke.unit.test.Man;

public class ZhangSanMan extends Man{
	
	public ZhangSanMan() {
		System.out.println("张三的构造器");
	}

	public static void main(String[] args) {
		ZhangSanMan zs=new ZhangSanMan();
		zs.move();//不同包的子类可以调用protecded
		
		//不能访问
		//zs.daDouDou();
	}
	
	private class PriClass{
		
		
	}
}

//private class PriClassB{
	
//}


