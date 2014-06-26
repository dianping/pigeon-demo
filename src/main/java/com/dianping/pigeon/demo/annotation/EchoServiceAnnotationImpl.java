/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.annotation;

import com.dianping.pigeon.demo.EchoService;
import com.dianping.pigeon.remoting.provider.config.annotation.Service;

@Service
public class EchoServiceAnnotationImpl implements EchoService {

	@Override
	public String echo(String input) {
		System.out.println("received: " + input);
		return "annotation service echo:" + input;
	}

	@Override
	public String echo2(String input) {
		System.out.println("received: " + input);
		return "annotation service echo2:" + input;
	}
}
