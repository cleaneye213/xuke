package com.xuken.array.task.answer;

import java.util.Arrays;

public class TaskServen {

	public static void main(String[] args) {
		//去掉数组内重复值，并在控制台打印出来
		
		int[] a= {12,1,2,3,4,3,12,11,1};
		//临时数组用来存放去重复后的数组
		int[] tempAry=new int[a.length];
		boolean flag=false;
		int t=0;
		for (int i = 0; i < tempAry.length; i++) {
			flag=false;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				//没有元素就将原数组的元素赋给临时数组
				tempAry[t]=a[i];
				t++;
			}
		}
		
		System.out.println(Arrays.toString(tempAry));
		//去除多余的空值
		tempAry=Arrays.copyOfRange(tempAry, 0, t);
		System.out.println("最终去除重复数值后的数组为："+Arrays.toString(tempAry));
	}

}
