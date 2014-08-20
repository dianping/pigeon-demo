/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

public class EchoServiceDefaultImpl implements EchoService, InitializingBean {

	private static final Logger logger = LoggerFactory.getLogger(EchoServiceDefaultImpl.class);
	
	@Override
	public String echo(String input) {
		return "echo:" + input;
	}

	@Override
	public String echo2(String input, int size) {
		// throw new InvocationFailureException("error raised:" + input);
		return "echo2:" + input + ",size:" + size;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// throw new RuntimeException("error with echo service");
	}
}
