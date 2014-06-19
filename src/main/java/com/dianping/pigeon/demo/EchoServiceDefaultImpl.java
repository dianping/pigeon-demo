/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo;


public class EchoServiceDefaultImpl implements EchoService {

	@Override
	public String echo(String input) {
		// throw new InvocationFailureException("error raised:" + input);
		return "echo:" + input;
	}

}
