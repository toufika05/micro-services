package com.example.user.valueobject;


import com.example.user.model.UserDTO;

public class ResponseVO {

	private UserDTO user;
	private Department dept;


	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
}
