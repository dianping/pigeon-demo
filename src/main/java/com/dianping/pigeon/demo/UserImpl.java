package com.dianping.pigeon.demo;

import java.io.Serializable;

public class UserImpl implements User, Serializable {

	private String username;

	public UserImpl(String username) {
		this.username = username;
	}

	@Override
	public String getUsername() {
		return username;
	}

	public String toString() {
		return username;
	}

}
