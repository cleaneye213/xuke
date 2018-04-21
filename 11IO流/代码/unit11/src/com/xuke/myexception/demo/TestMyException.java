package com.xuke.myexception.demo;


public class TestMyException {

	public static void main(String[] args) {
		String[] s= {"a","b","c","d"};
		ArrayTools3 aTool=new ArrayTools3();
		String temp=null;
		try {
			temp=aTool.get(null, 7);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("111111");
		}
		System.out.println("2222");
	}
}
