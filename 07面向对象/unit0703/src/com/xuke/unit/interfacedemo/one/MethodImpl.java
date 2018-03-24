package com.xuke.unit.interfacedemo.one;

public class MethodImpl implements MethodInterface{

	@Override
	public void eat() {
		System.out.println("eat  method");
		
	}

	@Override
	public String print() {
		return "print print";
	}

}
