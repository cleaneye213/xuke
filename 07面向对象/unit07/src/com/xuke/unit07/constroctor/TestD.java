package com.xuke.unit07.constroctor;

public class TestD {
	
	public void changeStudeName(Student stu) {
		stu.setName("李四");
	}

	public static void main(String[] args) {
		Student std=new Student();
		String s="张三";
		std.changeVaril(s);
		//System.out.println(s);
		//System.out.println(std.name);
		
		TestD td=new TestD();
		td.changeStudeName(std);
		System.out.println("student的name"+std.name);
	}

}
