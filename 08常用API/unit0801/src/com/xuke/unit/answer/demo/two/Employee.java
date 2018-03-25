package com.xuke.unit.answer.demo.two;

public abstract class Employee {

	public String name;
	
	public String empNo;
	
	public abstract void work();

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empNo=" + empNo + "]";
	}
	
}
