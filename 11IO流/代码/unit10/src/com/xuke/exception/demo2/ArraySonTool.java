package com.xuke.exception.demo2;

public class ArraySonTool extends ArrayTools2{
	
	//重新父类的方法s时，Throws异常
	//子类可以不重新throws异常
	//或者throws跟父类一样的异常或者父类的某个异常
	//throws父类异常的父类，但不能是不同类型的异常
	
	@Override
	public <T> T get(T[] t, int index) throws ClassCastException,NullPointerException{
		// TODO Auto-generated method stub
		return super.get(t, index);
	}
	
	public <T> T get(T[] t, int index,int index2) throws ClassCastException,NullPointerException{
		// TODO Auto-generated method stub
		return super.get(t, index);
	}
}
