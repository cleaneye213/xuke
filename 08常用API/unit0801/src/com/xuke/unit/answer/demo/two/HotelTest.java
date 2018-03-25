package com.xuke.unit.answer.demo.two;

public class HotelTest {

	public static void main(String[] args) {
//		题目：某五星级酒店，资金雄厚，要招聘多名员工（经理、厨师、服务员）。入职的员工需要记录个人信息（姓名、工号、经理特有奖金属性）。他们都有自己的工作要做。
//		本案例要完成如下需求：
//			获取酒店幸运员工；
//			酒店开设VIP服务，酒店的厨师与服务员可以提供VIP服务。（厨师做菜加量、服务员给顾客倒酒）。
//			编写测试类
//			向酒店中，增加多名员工（其中包含1名经理，1名厨师、2名服务员）；
//			调用酒店员工的工作功能
//			调用酒店员工的VIP服务功能
		
		  Hotel hotel=new Hotel();
		  
		  ManagerEmpl me1=new ManagerEmpl("张三1","101",50000);
		  ManagerEmpl me2=new ManagerEmpl("张三2","102",50000);
		  ManagerEmpl me3=new ManagerEmpl("张三3","103",50000);
		  
		  CookerEmpl cm1=new CookerEmpl("李四1","201");
		  CookerEmpl cm2=new CookerEmpl("李四2","202");
		  CookerEmpl cm3=new CookerEmpl("李四3","203");
		  
		  WaiterEmpl we1=new WaiterEmpl("服务员1", "301");
		  WaiterEmpl we2=new WaiterEmpl("服务员2", "302");
		  WaiterEmpl we3=new WaiterEmpl("服务员3", "303");
		  
		  hotel.addEmployee(me1);
		  hotel.addEmployee(me2);
		  hotel.addEmployee(me3);
		  hotel.addEmployee(cm1);
		  hotel.addEmployee(cm2);
		  hotel.addEmployee(cm3);
		  hotel.addEmployee(we1);
		  hotel.addEmployee(we2);
		  hotel.addEmployee(we3);
		  
		  System.out.println(hotel.toString());
		  
		  Employee emp=hotel.lucyEmployee();
		  System.out.println(emp);
		  
		  emp.work();
		  if(emp instanceof CookerEmpl) {
			  CookerEmpl emp1=(CookerEmpl)emp;
			  emp1.vipSerice();
		  }else if(emp instanceof WaiterEmpl) {
			  WaiterEmpl emp1=(WaiterEmpl)emp;
			  emp1.vipSerice();
		  }
		  
		  
	}

}
