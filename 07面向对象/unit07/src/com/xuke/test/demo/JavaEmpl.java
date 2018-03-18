package com.xuke.test.demo;

public class JavaEmpl extends TechnicalEmpl{

	@Override
	public void work() {
		//员工号为xxx的 xxx员工，正在研发淘宝网站
		System.out.println("员工号为："+this.getIdNo()+"的 "+getName()+"员工，正在研发淘宝网站");
	}
}
