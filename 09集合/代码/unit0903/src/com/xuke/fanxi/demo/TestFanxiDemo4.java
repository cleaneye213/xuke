package com.xuke.fanxi.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xuke.set.demo.Person;

public class TestFanxiDemo4 {

	public static void main(String[] args) {
		ResponseMes<Person> rep=new ResponseMes<>();
		rep.setT(new Person("ddsd",111));
		System.out.println(rep);
		
		ResponseMes<Tiger> rep2=new ResponseMes<>();
		rep2.setT(new Tiger("ddsd",111));
		System.out.println(rep2);
	}

	//需求：写一个函数，调用者传递什么类型的变量，该函数就返回什么类型的变量
	// public <泛型的声明> 返回值类型  函数名( 泛型 变量名  ){
	public <T> T getData(T t) {
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
