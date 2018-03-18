package com.xuken.array.task.answer;

import java.util.Arrays;

public class Student {
	//提供name,age,phone,address,email成员变量
	private String name;
	private int age;
	private String phone;
	private String address;
	private String email;
	
	public static Student[] stuAry=null;
	
	//保存学生信息到学生数组里
	public void saveStuInfos(Student stu) {
		if(stuAry==null) {
			stuAry=new Student[1];
			stuAry[0]=stu;
		}else {
			stuAry=Arrays.copyOf(stuAry, stuAry.length+1);
			stuAry[stuAry.length-1]=stu;
		}
	}
	
	public Student() {
		
	}
	
	public Student(String name,int age,String phone,String address,String email) {
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.address=address;
		this.email=email;
	}
	
	
//	public Student[] getStuAry() {
//		return stuAry;
//	}
//
//	public void setStuAry(Student[] stuAry) {
//		this.stuAry = stuAry;
//	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", phone=" + phone + ", address=" + address + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
