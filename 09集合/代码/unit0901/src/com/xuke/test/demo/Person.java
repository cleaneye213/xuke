package com.xuke.test.demo;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
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
	public int hashCode() {
		return (this.name+"@"+this.age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(obj instanceof Person) {
			Person temp=(Person)obj;
			if(this.name.equals(temp.name) && this.age==temp.age) {
				return true;
			}
		}
		return false;
	}

}
