package com.xuke.unit.answer.demo.two;

public class WaiterEmpl extends Employee implements VipSerice{
	
	public WaiterEmpl() {
		
	}
	
	public WaiterEmpl(String name,String empNo) {
		this.name=name;
		this.empNo=empNo;
	}

	@Override
	public void work() {
		System.out.println("我是服务员，很高兴为你服务!");
		
	}

	@Override
	public void vipSerice() {
		System.out.println("免费倒酒！");
		
	}

}
