package com.xuke.unit.answer.demo;

import java.util.Arrays;
import java.util.Scanner;

public class NarcissisticNum2 {
	/**
	 * 
	 * 1、春天是鲜花的季节，水仙花就是其中最迷人的代表，数学上有个水仙花数，
	 * 他是这样定义的：
		“水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，
		比如：153=1^3+5^3+3^3。
		现在要求输出所有在m和n范围内的水仙花数。(100<=m<=n<=999）
			在控制台中输出m和n之间的所有“水仙花数”
	 * 
	 * 
	 */
	public static int[] PrintBarcisssistNum(int m,int n) {
		//1、判断m,n的有效值
		//是否是三位数，n>=m,m>=100,n<=999
		//参数边界
//		if(m<100 || m>999) {
//			return null;
//		}
//		if(n<m || n>999) {
//			return null;
//		}
		
		//有效参数
		int[] temp=new int[900];
		int j=0;
		if(100<=m && m<n && n<=999) {
			//2、变量m到n之间所有的数，判断每个数是否符合
			///水仙花数的规则-->153=1^3+5^3+3^3
			int a=0;//个分位数字
			int b=0;//十分位数字
			int c=0;//百分位数字
			for(int i=m;i<=n;i++) {
				a=i%10;
				b=i/10%10;
				c=i/100;
				if(i==(c*c*c+b*b*b+a*a*a)) {
					temp[j]=i;
					j++;
				}
			}
			
			//3、保存到数组后，从小到大进行排序
			if(j!=0) {
				temp=Arrays.copyOf(temp, j);
			}else {
				temp=null;
			}
			return temp;
		}else {
			return null;
		}
		
		
		//return null;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int[] temp=PrintBarcisssistNum(m,n);
		if(temp!=null) {
			System.out.println(Arrays.toString(temp));
		}else {
			System.out.println("没有找到水仙花数或者请检查区间参数的有效性");
		}
		
		
	}

}
