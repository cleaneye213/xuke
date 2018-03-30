package com.xuke.transfer.demo;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String[] args) {
		BigDecimal b1=new BigDecimal("122");
		BigDecimal b2=new BigDecimal("2");
		System.out.println(b1.divide(b2));
		
		BigDecimal b3=new BigDecimal("12222.33");
		BigDecimal b4=new BigDecimal("123");
		//不能整除时，要定义小数点精度，及舍入方式
		//System.out.println(b3.divide(b4));
		System.out.println(12222.33/123);
		System.out.println(b3.divide(b4,BigDecimal.ROUND_HALF_UP));
		System.out.println(b3.divide(b4,3,BigDecimal.ROUND_HALF_UP));

	}

}
