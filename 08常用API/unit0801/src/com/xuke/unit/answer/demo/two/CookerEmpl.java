package com.xuke.unit.answer.demo.two;

public class CookerEmpl extends Employee implements VipSerice{

	public CookerEmpl() {
		
	}
	
	public CookerEmpl(String name,String empNo) {
		this.name=name;
		this.empNo=empNo;
	}
 
	@Override
	public void work() {
		System.out.println("我在炒菜!");
		
	}

	@Override
	public void vipSerice() {
		System.out.println("很高兴为你服务，加菜!");
		
	}

}
