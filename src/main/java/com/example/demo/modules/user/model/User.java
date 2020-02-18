package com.example.demo.modules.user.model;

import javax.persistence.Entity;

import com.example.demo.modules.base.BaseEntity;

@Entity
public class User extends BaseEntity {

	private static final long serialVersionUID = 4198035375899322269L;

	private String username;
	private String emil;

	public String getUsername() {
		return username;
	}

	public String getEmil() {
		return emil;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmil(String emil) {
		this.emil = emil;
	}

}
