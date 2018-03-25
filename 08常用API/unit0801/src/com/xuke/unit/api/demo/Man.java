package com.xuke.unit.api.demo;

public class Man {
	
	private int age;
	private String sex;
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "Man [age=" + age + ", sex=" + sex + "]";
	}

	public static void main(String[] args) {
		Man  m1=new Man();
		Man  m2=new Man();
		Man m3=m1;
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		m3.setAge(20);
		m3.setSex("男");
		System.out.println(m3.toString());
		System.out.println(m1.toString());
		
	}

}
