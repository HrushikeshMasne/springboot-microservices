package com.hruhikesh.microservices.ValueObj;

import com.hruhikesh.microservices.entity.User;

public class ResponseTemplateVO {
	
	//this wil contain User and Dept obj
	//will use this class as response object to return User details which contain all data including Dept details
	private User user;
	private Department department;
	
	
	public ResponseTemplateVO() {
		super();
	}
	
	public ResponseTemplateVO(User user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "ResponseTemplateVO [user=" + user + ", department=" + department + "]";
	}
	
}
