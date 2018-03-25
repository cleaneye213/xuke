package com.xuke.unit.answer.demo.two;

import java.util.Arrays;

public class Hotel {
	
	/**
	 * 酒店名称
	 */
	private String name;
	
	/**
	 * 员工集合
	 */
	private Employee[] empAry=null;
	
	/**
	 * 招聘员工
	 * @param empl
	 */
	public void addEmployee(Employee empl) {
		if(empAry==null) {
			empAry=new Employee[1];
			empAry[0]=empl;
		}else {
			empAry=Arrays.copyOf(empAry, empAry.length+1);
			empAry[empAry.length-1]=empl;
		}
	}

	
	public Employee lucyEmployee() {
		Employee temp=null;
		if(getEmpAry()!=null) {
			int index=(int) Math.round((Math.random()*10));
			while(true) {
				if(index<getEmpAry().length) {
					temp= getEmpAry()[index];
					break;
				}else {
					index=(int) Math.round((Math.random()*10));
				}
			}
			
		}
		return temp;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee[] getEmpAry() {
		return empAry;
	}

	public void setEmpAry(Employee[] empAry) {
		this.empAry = empAry;
	}


	@Override
	public String toString() {
		return "Hotel [name=" + name + ", empAry=" + Arrays.toString(empAry) + "]";
	}

	
}
