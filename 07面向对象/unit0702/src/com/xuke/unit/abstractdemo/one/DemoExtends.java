package com.xuke.unit.abstractdemo.one;

/**
 * 继承抽象类必须要实现抽象类中的抽象方法
 * @author Dell
 *
 */
public class DemoExtends extends MyClassDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat() {
		System.out.println("重写抽象类的方法");
		
	}

}
