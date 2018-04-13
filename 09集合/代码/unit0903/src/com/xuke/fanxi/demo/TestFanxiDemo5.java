package com.xuke.fanxi.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xuke.set.demo.Person;

public class TestFanxiDemo5 {

	public static void main(String[] args) {
		TestFanxiDemo5 demo = new TestFanxiDemo5();
		demo.getData("sdfsdf");
		demo.getData(new Person("sdfsdf",83));
	}
	

	//需求：写一个函数，调用者传递什么类型的变量，该函数就返回什么类型的变量
	// public <泛型的声明> 返回值类型  函数名( 泛型 变量名  ){
	public <T> T getData(T t) {
		System.out.println(t);
		return t;
	}
	
	public void getData2(Object obj) {
		
	}
	
	public <T> String getData3(T t) {
		return "";
	}
	
	public <T> T getData4(T t) {
		return t;
	}
	
}
