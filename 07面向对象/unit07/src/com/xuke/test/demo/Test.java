package com.xuke.test.demo;

public class Test {

	public static void main(String[] args) {
		
		Employee emp1=new JavaEmpl();
		emp1.setName("张三");
		emp1.setIdNo("0001");
		emp1.work();
		
		Employee emp2=new NetWorkerEmpl();
		emp2.setName("李四");
		emp2.setIdNo("0002");
		emp2.work();
	}

}
