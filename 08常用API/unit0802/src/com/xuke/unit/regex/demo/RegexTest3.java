package com.xuke.unit.regex.demo;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest3 {

	public static void main(String[] args) {
		String telNo="11dfwefe3432";
		telNo="0591-8888888";
		//判断国内电话号码是否符合规范
		boolean flag=telNo.matches("\\d{3}-\\d{8}|\\d{4}-\\d{7}");
		if(!flag) {
			System.out.println("电话号码不符合要求，请重新输入");
		}else {
			System.out.println("电话号码符合要求!");
		}
		
		// 要验证的字符串
	    String str = "service@xsoftlab.net";
	    // 邮箱验证规则
	    String regEx = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
	    // 编译正则表达式
	    Pattern pattern = Pattern.compile(regEx);
	    Matcher matcher = pattern.matcher(str);
	    // 字符串是否与正则表达式相匹配
	    boolean rs = matcher.matches();
	    System.out.println(rs);
	}

}
