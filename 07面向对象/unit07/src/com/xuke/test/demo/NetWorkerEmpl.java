package com.xuke.test.demo;

public class NetWorkerEmpl extends OperationEmpl{

	@Override
	public void work() {
		System.out.println("员工号为："+this.getIdNo()+"的 "+getName()+"员工，正在检查网络是否畅通");
	}
}
