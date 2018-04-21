package com.xuke.myexception.demo;

public class ArrayTools3 {

	
	//根据传递进来的索引值和数组，或者该数组此索引的值
	public <T> T get(T[] t,int index) throws MyExceptionDemo {
		if(t==null) {
			throw new MyExceptionDemo();
		}
		return t[index];
	}
	
	public <T> T get2(T[] t,int index) {
		if(t==null) {
			//001-->Map--key
			//更新失败-->map-value
			throw new MyExceptionDemo2("001");
		}
		return t[index];
	}
}
