package com.example.demo.modules.user.controller;

import javax.validation.constraints.NotNull;

public class UserLogin {

	@NotNull
	private String useranme;
	@NotNull
	private String password;

	public String getUseranme() {
		return useranme;
	}

	public String getPassword() {
		return password;
	}

	public void setUseranme(String useranme) {
		this.useranme = useranme;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
