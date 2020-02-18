package com.example.demo.modules.base;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -5937076236492486024L;

	@Id
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
