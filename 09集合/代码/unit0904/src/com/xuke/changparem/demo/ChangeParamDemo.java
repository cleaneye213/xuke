package com.xuke.changparem.demo;

import java.util.Arrays;

import com.xuke.fanxi.demo.Tiger;

public class ChangeParamDemo {
	
	/**
	 * 可变参数--》是一个数组
	 */
	public static void print(String...name) {
		//打印name
		System.out.println(Arrays.toString(name));
	}
	
	public static void print2(String name) {
		
	}
	
	public static <T> void print3(T...t) {
		System.out.println(Arrays.toString(t));
	}
	
	//如果还有其他参数，必须写在可变参数的前面
	public static void print4(int age,String...name) {
		//打印name
		System.out.println(Arrays.toString(name));
	}
	
	//如果还有其他参数，必须写在可变参数的前面,不能有多个可变参数
	public static void print5(int age,int...name) {
		//打印name
		System.out.println(Arrays.toString(name));
	}

	public static void main(String[] args) {
		String parm1="dfsdf1";
		String parm2="dfsdf2";
		String parm3="dfsdf3";
		String parm4="dfsdf4";
		String parm5="dfsdf5";
		ChangeParamDemo.print(parm1,parm2,parm3,parm4);
		
		String[] strAry=new String[] {parm1,parm2,parm3,parm4};
		ChangeParamDemo.print(strAry);
		//ChangeParamDemo.print2(strAry);
		
		ChangeParamDemo.print3(parm1,parm2,new Tiger());
	}
	

}
