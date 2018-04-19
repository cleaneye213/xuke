package com.xuke.exception.demo2;

public class ArrayTools2 {

	
	//根据传递进来的索引值和数组，或者该数组此索引的值
	public <T> T get(T[] t,int index) throws NullPointerException,ArrayIndexOutOfBoundsException {
		return t[index];
	}
}
