package com.xuke.unit.test2;

import com.xuke.unit.test.Man;

public class PackageTest {

	public static void main(String[] args) {
		Man m=new Man();
		//defualt :同一个包内，同一个类都有效，不在同一个包无效
		//m.eat();
		
		//protected
		//m.move();
		
		ZhangSanMan zsMan=new ZhangSanMan();
	}

}
