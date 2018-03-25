package com.xuke.unit.api.stringdemo;

public class StringApiDemo2 {

	public static void main(String[] args) {
		String s="中华人民共和国";
		System.out.println(s.length());//7
		
		System.out.println(s.substring(1,s.length()));//华人员共和国
		System.out.println(s.substring(1,4));//华人民共
		System.out.println(s);
		
		String s2=s.substring(1,4);
		//保存数据库
		//save(s2);
		System.out.println("=================");
		int a=10;
		System.out.println("1："+a);//10
		System.out.println("2："+(a+10));//20
		System.out.println("3："+a);//10
		System.out.println("4："+(a++));//10
		System.out.println("5："+a);//11
		System.out.println("6："+(++a));//
		System.out.println("7："+a);//
		
		a+=1;
		a=a+1;
		
		String ss=null;
		String ss1="oooo";
		String ss2=new String();
		if(ss!=null) {
			System.out.println(ss.toString());
		}
		System.out.println(String.valueOf(ss));
		System.out.println(ss1.toString());
		System.out.println(ss2.toString());
		System.out.println("end");
	}

}
