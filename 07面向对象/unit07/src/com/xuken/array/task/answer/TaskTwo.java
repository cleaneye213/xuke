package com.xuken.array.task.answer;

import java.util.Arrays;

public class TaskTwo {
	int sum;

	public static void main(String[] args) {
		//2.把1----36分别放入数组中，计算数组对角元素之和。6 * 6的二维数组 
		//int[][] a=new int[6][6];
		/*{
		 * {1 , 2, 3, 4, 5, 6},
		 * {7 , 8, 9, 10,11,12},
		 * {13,14,15,16,17,18},
		 * {19,20,21,22,23,24},
		 * {25,26,27,28,29,30},
		 * {31,32,33,34,35,36}
		 * 
		 * }
		 * */
		int[][] a= {{1 , 2, 3, 4, 5, 6},
				    {7 , 8, 9, 10,11,12},
				    {13,14,15,16,17,18},
				    {19,20,21,22,23,24},
				    {25,26,27,28,29,30},
				    {31,32,33,34,35,36}};
		//先遍历一维数组
		System.out.println(a.length);//输出6--》数组长度
		int sum=0;
		for(int i=0;i<a.length;i++) {
			//System.out.println(Arrays.toString(a[i]));
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					sum+=a[i][j];
				}
			}
		}
		System.out.println("对角原素之和："+sum);

		//0,5
		//1,4
		//2,3
		//3,2
		//4,1
		//5,0
		sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if((i+j)==5) {
					sum+=a[i][j];
				}
			}
		}
		System.out.println("反向对角原素之和："+sum);
		
		//怎么把1-36数字，存放到6*6的数组里
	}

}
