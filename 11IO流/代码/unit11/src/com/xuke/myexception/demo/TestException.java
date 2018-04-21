package com.xuke.myexception.demo;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"a","b","c","d"};
		ArrayTools3 aTool=new ArrayTools3();
		try {
			String temp=aTool.get2(null, 7);
		} catch (MyExceptionDemo2 e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
