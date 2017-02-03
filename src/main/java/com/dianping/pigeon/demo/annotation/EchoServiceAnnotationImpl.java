/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.annotation;

import com.dianping.lion.client.Lion;
import com.dianping.pigeon.demo.EchoService;
import com.dianping.pigeon.demo.User;
import com.dianping.pigeon.demo.UserImpl;
import com.dianping.pigeon.remoting.provider.config.annotation.Service;

@Service
public class EchoServiceAnnotationImpl implements EchoService {

	@Override
	public String echo(String input) {
		System.out.println("received: " + input);
		return "annotation service echo:" + input;
	}

	@Override
	public String echoWithSleep(String input) {
		try {
			Thread.sleep(Lion.getIntValue("pigeon-test.echo.sleep"));
		} catch (InterruptedException e) {
		}
		return "echo:" + input;
	}

	@Override
	public User getUser(String username) {
		return new UserImpl(username);
	}
}
