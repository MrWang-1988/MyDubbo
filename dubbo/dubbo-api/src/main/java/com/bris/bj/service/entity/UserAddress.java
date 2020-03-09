package com.bris.bj.service.entity;

import java.io.Serializable;

public class UserAddress implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String email;
	private int age;
	private String addr;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public UserAddress(String userName, String email, int age, String addr) {
		super();
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.addr = addr;
	}
	public UserAddress() {
		super();
	}
	
}
