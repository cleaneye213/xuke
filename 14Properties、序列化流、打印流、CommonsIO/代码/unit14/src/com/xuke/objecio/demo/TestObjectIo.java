package com.xuke.objecio.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestObjectIo {

	public static void main(String[] args) throws IOException {
		// 把person对象序列化到硬盘中
		//1 创建目的地
		FileOutputStream fos=new FileOutputStream("person.txt");
		//2创建对象流
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//3 把对象序列化到文件
		//java.io.NotSerializableException: com.xuke.objecio.demo.Person
		//writeObject对传递的对象有要求：必须是实现了序列化接口
		Person per=new Person("张三","123456");
		List<Role> list=new ArrayList<>();
		Role r1=new Role();
		r1.setRoleName("角色1");
		r1.setCreateTime(new Date());
		Role r2=new Role();
		r2.setRoleName("角色2");
		r2.setCreateTime(new Date());
		
		list.add(r1);
		list.add(r2);
		
		per.setRole(list);
		oos.writeObject(per);
		//关闭流
		oos.close();
		fos.close();

	}

}
