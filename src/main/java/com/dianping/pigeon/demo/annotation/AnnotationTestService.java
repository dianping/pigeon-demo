/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.annotation;

import com.dianping.pigeon.demo.EchoService;
import com.dianping.pigeon.remoting.invoker.config.annotation.Reference;

public class AnnotationTestService {

	@Reference(timeout = 500)
	private EchoService echoService;

	public String testEcho(String input) {
		return echoService.echo(input);
	}
}
