/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EchoServiceDefaultImpl implements EchoService {

	private static final Logger logger = LoggerFactory.getLogger(EchoServiceDefaultImpl.class);

	@Override
	public String echo(String input) {
		System.out.println(input);
		return "echo:" + input;
	}

	@Override
	public User getUser(String username) {
		return new UserImpl(username);
	}

}
