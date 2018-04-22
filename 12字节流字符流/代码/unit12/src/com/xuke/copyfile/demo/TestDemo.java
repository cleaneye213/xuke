package com.xuke.copyfile.demo;

import java.io.UnsupportedEncodingException;

public class TestDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = new String("hhhh ty胜多负少两个");
		System.out.println(new String(str.getBytes("GBK")));
		System.out.println(new String(str.getBytes("UTF-8")));
	}

}
