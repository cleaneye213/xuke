package com.xuke.unit.innerclass.demo;

public class Car {
	
	class Power{
		public void print() {
			System.out.println("111");
		}
	}
	
	public void move() {
		
		class Wheel{
			public void print() {
				System.out.println("222");
			}
		}
		
	}

	public static void main(String[] args) {
		Car car=new Car();
		Power p=car.new Power();
		p.print();

	}

}
