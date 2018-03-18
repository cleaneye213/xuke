package com.xuken.array.task.answer;

public class StudentTest {

	public static void main(String[] args) {
		Student stu=null;
		//String name,int age,String phone,String address,String email
		//保存学生信息
		for(int i=1;i<11;i++) {
			stu=new Student("张三"+i,i+10,"188888"+i,"创业大厦"+i,"888"+i+"@126.com");
			stu.saveStuInfos(stu);
		}
		//输出所有的学生信息
		Student[] stuAry = Student.stuAry;
		for (Student student : stuAry) {
			System.out.println(student.getName());
		}
		System.out.println("=================");
		System.out.println("========校长=========");
		Teacher tch=new Teacher("李四","校长");
		tch.queryStuInfo("", "1888881", "", "");
		System.out.println("========老师=========");
		Teacher tc2=new Teacher("王五","老师");
		tc2.queryStuInfo("", "1888881", "", "");
	}

}
