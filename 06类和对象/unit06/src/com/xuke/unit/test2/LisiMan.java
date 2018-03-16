package com.xuke.unit.test2;

public class LisiMan {
	
	String name;
	double height;
	
	public LisiMan() {
		
	}
	
	//前提：必须定义一个空的构造器
	public LisiMan(String name,double height) {
		this.name=name;
		this.height=height;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static void main(String[] args) {
		LisiMan lsMan=new LisiMan();
		System.out.println("1111--->"+lsMan.height);
		
		lsMan=new LisiMan("李四",177);
		
		System.out.println("222--->"+lsMan.height);
		lsMan.setName("李四New");
		System.out.println(lsMan.getName());
	}

}
