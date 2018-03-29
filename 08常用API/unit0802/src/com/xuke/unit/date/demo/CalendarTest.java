package com.xuke.unit.date.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		//
		Calendar c=Calendar.getInstance();
		Date time = c.getTime();
		System.out.println(time.toString());
		//获取年份
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		//获取月份(0-11)对应1-12月份
		int month = c.get(Calendar.MONTH);
		System.out.println(month);
		
		//获取当前一个月中的第几天
		int date = c.get(Calendar.DATE);
		System.out.println(date);
		
		//获取当前是星期几(从星期天开始算1)
		int wkDate = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(wkDate);
		
		System.out.println("======================");
		
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(c.getTime()));
		//输出60天后是几月几号
		//c.set(Calendar.DATE, 60);
		c.set(Calendar.MONTH, 13);
		//c.add(Calendar.DATE, 60);
		System.out.println(df.format(c.getTime()));
	}

}
