package com.xuken.array.task.answer;

import java.util.Arrays;

public class TaskFive {

	public static void main(String[] args) {
		// 有一个数组，用户输入一个数，添加到原数组，
		//按从小到大排序插入适当位置。 (冒泡排序新增后的数组)
		int[] a= {10,9,8,7,6,5,4,3,2,1};
		//10
		//用户输入一个数，添加到原数组->11  
		//new 新数组
		
		//1、创建一个新的数组
		int[] newAry=new int[a.length+1];
		//2、把旧数组的值复制到新数组中
		for(int i=0;i<a.length;i++) {
			newAry[i]=a[i];
		}
		System.out.println(Arrays.toString(newAry));
		//3、把新数据存放到新数组的最后一位
		newAry[newAry.length-1]=12;
		//4、排序新数组
		Arrays.sort(newAry);
		System.out.println(Arrays.toString(newAry));
	}

}
