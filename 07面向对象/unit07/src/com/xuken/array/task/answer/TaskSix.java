package com.xuken.array.task.answer;

import java.util.Arrays;

public class TaskSix {

	public static void main(String[] args) {
		// 有一个长度是10的数组，
		//要求删除某一个位置的元素，后边元素前置。
		int[] b= {10,9,8,7,6,5,4,3,2,1};
		int index=5;
		
		//方法一
		int[] cAry=new int[b.length-1];
		for(int i=0;i<b.length;i++) {
			if(i!=index && i<index) {
				cAry[i]=b[i];
			}else if(i>index) {
				cAry[i-1]=b[i];
			}
		}
		b=cAry;
		System.out.println(Arrays.toString(b));
		
	}

}
