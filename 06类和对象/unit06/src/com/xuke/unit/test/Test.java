package com.xuke.unit.test;

public class Test {

	public static void main(String[] args) {
		Man man=new Man();
		System.out.println(man.birthday);
		
		man.eat();
		
		Women w=new Women();
		w.eat();
		
		man.marry(w);
	}

}
