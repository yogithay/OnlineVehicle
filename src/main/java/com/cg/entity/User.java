package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private String UserId;
	 @Column(name="userpassword")
	 private String password;
	 @Column(name="userrole")
	 private String role;
	 

	 public User() {}


	public User(String userId, String password, String role) {
		super();
		UserId = userId;
		this.password = password;
		this.role = role;
	}


	public String getUserId() {
		return UserId;
	}


	public void setUserId(String userId) {
		UserId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", password=" + password + ", role=" + role + "]";
	}

	
}
