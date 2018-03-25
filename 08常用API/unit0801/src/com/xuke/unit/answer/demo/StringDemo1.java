package com.xuke.unit.answer.demo;

import java.util.Scanner;

public class StringDemo1 {

	/**
	 * 获取指定字符串中，大写字母、小写字母、数字的个数。
	 * 
	 * @param str
	 */
	public static void printNum(String str) {
		// 定义3个变量保存大写字母、小写字母、数字的个数
		int upNum = 0;
		int smllNum = 0;
		int numCount = 0;
		char[] cStr = str.toCharArray();
		for (char c : cStr) {
			// 判断是否是大写字母
			if ('A' <= c && c <= 'Z') {
				upNum++;
			}
			// 判断是否是小写字母
			if ('a' <= c && c <= 'z') {
				smllNum++;
			}
			// 判断是否是数字
			if ('0' <= c && c <= '9') {
				numCount++;
			}
		}
		System.out.println("字符串总个数：" + str.length() + "中大写字母：" + upNum + ",小写字母：" + smllNum + "数字：" + numCount);

	}

	public static void main(String[] args) {
		// 从控制台接收字符串
		Scanner sc = new Scanner(System.in);
		String temp = "";
		while (sc.hasNext()) {
			temp = sc.nextLine();
			if ("end".equals(temp)) {
				System.out.println("退出统计");
				break;
			}
			printNum(temp);

		}

		// String temp = "dgdlkweKJJHGF24323hj434j5jk";

	}
}
