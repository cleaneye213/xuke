package com.xuke.net.demo3;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		// 
		InetAddress ip=InetAddress.getByName("www.baidu.com");
		System.out.println(ip.getHostName());
		//获取IP地址
		System.out.println(ip.getHostAddress());

	}

}
