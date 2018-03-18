package com.xuken.array.task.answer;

import java.util.Arrays;

public class TaskSix2 {

	public static void main(String[] args) {
		// 有一个长度是10的数组，
		//要求删除某一个位置的元素，后边元素前置。
		//{10,9,8,7,6,5,4,3,2,1};
		//{10,9,8,7,6,4,5,3,2,1};
		//{10,9,8,7,6,4,3,5,2,1};
		//{10,9,8,7,6,4,3,2,5,1};
		//{10,9,8,7,6,4,3,2,1,5};
		//{10,9,8,7,6,4,3,2,1,0};
		
		int[] b= {10,9,8,7,6,5,4,3,2,1};
		int index=5;
		
		int temp=0;
		for(int i=index;i<b.length;i++) {
			//for(int j=index+1;j<b.length;j++) {
				if(i<b.length-1) {
					temp=b[i];
					b[i]=b[i+1];
					b[i+1]=temp;
				}
			//}
		}
		
		System.out.println(Arrays.toString(b));
	}

}
