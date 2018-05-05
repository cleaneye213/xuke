package com.xuke.objecio.demo;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3506593652799098761L;
	private String roleName;
	private Date createTime;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Role [roleName=" + roleName + ", createTime=" + createTime + "]";
	}
	
	
}
