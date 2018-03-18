package com.xuken.array.task.answer;

public class TaskThree {

	public static void main(String[] args) {
		// 判断一个数组是否对称
		//a[i]=a[a.length-1-i]
		//i=0  4
		//i=1  3
		//i=2  2 
		//i=3  1
		//....
		int[] a= {1,2,3,4,5,6,5,4,3,2,1,5,5,5};
		boolean flag=true;
		System.out.println(a.length/2+1);
		for(int i=0;i<(a.length/2+1);i++) {
			if(a[i]!=a[a.length-1-i]) {
				flag=false;//不是对称数组
				break;
			}
		}
		
		if(flag) {
			System.out.println("是对称数组");
		}else {
			System.out.println("不是对称数组");
		}
	}

}
