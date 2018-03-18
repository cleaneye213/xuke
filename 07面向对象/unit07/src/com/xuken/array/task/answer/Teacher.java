package com.xuken.array.task.answer;

public class Teacher {

	String name;
	String duty;
	
	public Teacher() {}
	
	public Teacher(String name,String duty) {
		this.name=name;
		this.duty=duty;
	}
	
	public void queryStuInfo(String name,String phone,String address,String email) {
		//根据参数查询所有的学生信息
		Student[] stuAry=Student.stuAry;
		for (Student stu : stuAry) {
			if("校长".equals(this.duty)) {
				if(stu.getName().equals(name) || 
						stu.getEmail().equals(email) ||
						stu.getPhone().equals(phone) ||
						stu.getAddress().equals(address)
						) {
					System.out.println(stu);
				}
			}else if("老师".equals(this.duty)){
				if(stu.getName().equals(name)) {
					System.out.println(stu);
				}
			}
			
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	
	
}
