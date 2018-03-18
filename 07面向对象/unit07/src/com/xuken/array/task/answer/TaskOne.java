package com.xuken.array.task.answer;

import java.util.Arrays;

public class TaskOne {

	public static void main(String[] args) {
		//1.把A数组的前5个元素复制到B数组中。
		int[] a= {1,2,3,4,5,6,7,8};
		int[] b=new int[5];
		//对b数组进行赋值
		for(int i=0;i<b.length;i++) {
			b[i]=a[i];
		}
		//输出B数组
		//方法一
//		for(int i=0;i<b.length;i++) {
//			System.out.println(b[i]);
//		}
		//方法二
		System.out.println(Arrays.toString(b));
		//System.out.println(b.toString());
		
		TaskOne tOne=new TaskOne();
		int[] cpAry = tOne.copyArray(a,8);
		System.out.println(Arrays.toString(cpAry));
	}

	/**
	 * 根据传进来的长度来复制数组
	 * @param a 
	 * @param len
	 * @return
	 */
	public int[] copyArray(int[] a,int len) {
		//1、传进来的参数是否有效
		if(a==null || a.length<len) {
			return null;
		}
		if(len<0) {
			return null;
		}
		//2复制数组
		int[] b=new int[len];
		for(int i=0;i<len;i++) {
			b[i]=a[i];
		}
		return b;
	}
}
