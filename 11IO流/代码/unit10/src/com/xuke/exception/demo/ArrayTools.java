package com.xuke.exception.demo;

public class ArrayTools {

	//根据传递进来的索引值和数组，或者该数组此索引的值
	public <T> T get(T[] t,int index) {
		if(t==null) {
			throw new NullPointerException("传进来的数组不能为空！");
		}
		//
		if(index>t.length) {
			throw new ArrayIndexOutOfBoundsException("索引值不能超过数组的长度！");
		}
		return t[index];
	}
	
	//根据传递进来的索引值和数组，或者该数组此索引的值
		public <T> T get2(T[] t,int index) throws NullPointerException,ArrayIndexOutOfBoundsException {
			return t[index];
		}
		
		public <T> T get3(T[] t,int index) throws RuntimeException,ArrayIndexOutOfBoundsException {
			return t[index];
		}
}
