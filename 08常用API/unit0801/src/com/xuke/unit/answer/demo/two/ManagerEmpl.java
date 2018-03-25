package com.xuke.unit.answer.demo.two;

public class ManagerEmpl extends Employee{
	
	private double bonus;

	public ManagerEmpl() {
	}
	
	public ManagerEmpl(String name,String empNo,double bonus) {
		this.name=name;
		this.empNo=empNo;
		this.bonus=bonus;
	}

	@Override
	public void work() {
		System.out.println("我是经理，有问题请找我!");
		
	}

}
