package com.xuke.myexception.demo;

public class ArrayTools3 {

	
	//根据传递进来的索引值和数组，或者该数组此索引的值
	public <T> T get(T[] t,int index) throws MyException{
		return t[index];
	}
}
