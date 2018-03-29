package com.xuke.unit.date.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.toString());
		//Wed Mar 28 20:18:45 CST 2018
		
		System.out.println(System.currentTimeMillis());
		System.out.println(new Date(System.currentTimeMillis()+60*1000));
		System.out.println(date.getTime());
		//希望能看到2018-03-28 20:19:13
		
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(format.format(new Date()));
		format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(format.format(new Date()));
		
		//----把时间字符串转出日期类型
		String dStr="2018-09-09 19:09:11";
		try {
			Date d=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dStr);
			System.out.println(d.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
