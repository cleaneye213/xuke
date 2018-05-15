package com.xuke.net.demo2;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLCodeDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// URLEncode和URLDecode
		//使用指定的编码机制将字符串转换为 application/x-www-form-urlencoded 格式
		String encode=URLEncoder.encode("中华","UTF-8");
		System.out.println(encode);
		
		//解码
		//解码的格式必须跟encode的编码格式一致才不会乱码
		String dcode=URLDecoder.decode("%E4%B8%AD%E5%8D%8E", "UTF-8");
		System.out.println(dcode);
		
	}

}
