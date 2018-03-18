package com.xuke.unit07.constroctor;

public class Student {
	String name;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public void changeVaril(String sss) {
		System.out.println("begin"+sss);
		sss="改变"+sss;
		System.out.println("end"+sss);
		name=sss;
	}
}
