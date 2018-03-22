package com.xuke.unit.finaldemo.one;

//public class TestFinalClassExtends extends TestFinalClass{
//不能继承final类
public class TestFinalClassExtends {
	
	public final  String NAME="张三";
	
	public final  int HEIGHT;
	
	public TestFinalClassExtends(int height) {
		this.HEIGHT=height;
	}
	
	public final void finalMethod() {
		System.out.println("这是一个final方法");
	}
	
	public static void main(String[] args) {
		TestFinalClassExtends tce=new TestFinalClassExtends(10);
		//tce.name="李四";//不能重写赋值
		System.out.println(tce.HEIGHT);
		//tce.HEIGHT=20;//不能重写赋值
		TestFinalClassExtends tce2=new TestFinalClassExtends(20);
	}
}
