package com.xuke.set.demo;

import java.util.Comparator;

public class Person implements Comparable<Person>{
	
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.age=age;
		this.name=name;
		
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



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person person) {
		if(this.age>person.age) {
			return -1;
		}else if(this.age<person.age){
			return 1;
		}
		return 0;
	}

	public int compare(Person p1, Person p2) {
		System.out.println("11111");
		if(p1.age>p2.age) {
			return -1;
		}else if(p1.age<p2.age){
			return 1;
		}
		return 0;
	}
	
}
