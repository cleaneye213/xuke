package com.xuke.objecio.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectIo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 把person对象反序列化到内存中
		//1 创建源目的地
		FileInputStream fis=new FileInputStream("person.txt");
		//2创建对象流
		ObjectInputStream ois=new ObjectInputStream(fis);
		//3 把对象反序列化到内存对象
		Person per=null;
		//如果在序列化后，更改版本号会出现以下异常
		// java.io.InvalidClassException: com.xuke.objecio.demo.Person;
		per=(Person)ois.readObject();
		System.out.println(per);
		//4关闭流
		fis.close();
		ois.close();
	}

}
