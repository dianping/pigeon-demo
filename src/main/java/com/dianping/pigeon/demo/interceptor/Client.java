/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.interceptor;

import com.dianping.pigeon.container.SpringContainer;
import com.dianping.pigeon.demo.EchoService;
import com.dianping.pigeon.remoting.invoker.process.InvokerProcessInterceptorFactory;

public class Client {

	private static SpringContainer CLIENT_CONTAINER = new SpringContainer(
			"classpath*:META-INF/spring/typical/invoker.xml");

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		CLIENT_CONTAINER.start();
		InvokerProcessInterceptorFactory.registerInterceptor(new MyInvokerProcessInterceptor());

		EchoService echoService = (EchoService) CLIENT_CONTAINER.getBean("echoService");
		System.out.println(echoService.echo("echoService_input"));
	}

}
