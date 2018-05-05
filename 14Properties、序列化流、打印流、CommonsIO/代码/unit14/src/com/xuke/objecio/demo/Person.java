package com.xuke.objecio.demo;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -64352625611796904L;

	private String userName;
	
	//不把密码进行序列化
	private transient String password;
	
	private List<Role> role;
	
	public Person(String userName,String password) {
		this.userName=userName;
		this.password=password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Person [userName=" + userName + ", role=" + role + "]";
	}

	
}
