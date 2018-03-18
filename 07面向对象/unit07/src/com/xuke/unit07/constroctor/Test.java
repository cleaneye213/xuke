package com.xuke.unit07.constroctor;

public class Test {
	String str;
	
	public void setStr(String str) {
		this.str=str;
	}
	

	public static void main(String[] args) {
		//Man m=new Man();
		Test test=new Test();
		test.setStr("测试this");
		System.out.println(test.str);
		
	}

}
