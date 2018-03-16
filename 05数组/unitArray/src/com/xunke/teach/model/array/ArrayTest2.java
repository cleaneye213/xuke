package com.xunke.teach.model.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] aAry=new int[5];
		for (int i = 0; i < aAry.length; i++) {
			aAry[i]=(i+1);
		}
		
		for (int i : aAry) {
			System.out.println(i);
		}
	}
}
