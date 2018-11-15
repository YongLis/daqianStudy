package com.sh.guaji.common;

public class Account {
	
	private String name;
	private String password;
	private String state; // 状态： 0 启用， 1 未启用
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	
	
}
