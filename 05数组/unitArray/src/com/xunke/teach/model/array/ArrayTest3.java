package com.xunke.teach.model.array;

import java.util.Arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 定义二维数组
		// 静态定义二维数组
		int[][] cAry = { { 2, 3, 4 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int[][] dAry =new int[4][3];
		System.out.println(cAry.length);
		System.out.println("==============");
		for(int i=0;i<cAry.length;i++) {
			for(int j=0;j<cAry[i].length;j++) {
				System.out.println(cAry[i][j]);
			}
		}
		System.out.println("==============");
		//动态数组赋值
		int[][] bAry = new int[3][4];
		for(int i=0;i<bAry.length;i++) {
			for(int j=0;j<bAry[i].length;j++) {
				bAry[i][j]=(i+1)*j;
			}
		}
		//输出动态数组值
		for(int i=0;i<bAry.length;i++) {
			for(int j=0;j<bAry[i].length;j++) {
				//System.out.println(bAry[i][j]);
			}
		}
		//驼峰命名
		//saveUser
		for(int i=0;i<bAry.length;i++) {
			int s=bAry[i][0];
			System.out.println(Arrays.toString(bAry[i]));
			
			
		}
		/*
		 * 注释
		 * */
		
		
	}
}
