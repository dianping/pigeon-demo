/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo;

public class UserServiceDefaultImpl implements UserService {

	@Override
	public User getUserDetail(User user, boolean withPassword) {
		System.out.println("received: " + user);

		user.setEmail(user.getUsername() + "@dianping.com");
		if (withPassword) {
			user.setPassword("123456");
		}
		if(user.getUsername() != null && user.getUsername().equals("scott")) {
			throw new RuntimeException("invalid user!");
		}
		return user;
	}

}
