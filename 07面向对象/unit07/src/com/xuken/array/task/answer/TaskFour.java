package com.xuken.array.task.answer;

import java.util.Arrays;

public class TaskFour {

	public static void main(String[] args) {
		//有一个长度是10的数组，数组内有10个不重复的数字，
		//要求按从小到大排序。(冒泡排序) 
		int[] a= {10,9,8,7,6,5,4,3,2,1};
		//第一步
		//temp=10;
		//{9,9...}
		//{9,10....}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		//调用工具类
		int[] b= {10,9,8,7,6,5,4,3,2,1};
		Arrays.sort(b);//自然排序(默认是升序)
		System.out.println(Arrays.toString(b));
		
	}

}
