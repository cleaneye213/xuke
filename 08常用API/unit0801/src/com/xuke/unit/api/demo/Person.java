package com.xuke.unit.api.demo;

public class Person {
	
	private int age;
	

	public int getAge() {
		//写业务逻辑
		return age;
	}

	public void setAge(int age) {
		//写业务逻辑
		this.age = age;
	}
	
	
	/**
	 * 重新equals方法
	 */
	public boolean equals(Object p){
		//默认的equals比较的是两个对象中存的内存地址
	    //1、先判断p是否为空
	    if(p==null){
		 return false;
	    }
	    //2、判断p是不是当前对象
	    if(this==p){
		return true;
	    }
	    //3、判断p是否是person类
	    if(!(p instanceof Person)){
	    	return false;
	    }
	    //4、判断是否是同龄人
	    Person per=(Person)p;
	    if(this.getAge()==per.getAge()){
	    	return true;
	    }else{
	    	return false;
	    }
	}

	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.setAge(20);
		Person p2=new Person();
		p2.setAge(30);
		Person p3=new Person();
		p3.setAge(20);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p3));

	}

}
