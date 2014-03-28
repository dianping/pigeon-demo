/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.interceptor;

import com.dianping.pigeon.container.SpringContainer;
import com.dianping.pigeon.demo.interceptor.MyProviderProcessInterceptor;
import com.dianping.pigeon.remoting.provider.process.ProviderProcessInterceptorFactory;

public class Server {

	private static SpringContainer SERVER_CONTAINER = new SpringContainer(
			"classpath*:META-INF/spring/typical/provider.xml");

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		SERVER_CONTAINER.start();
		ProviderProcessInterceptorFactory.registerInterceptor(new MyProviderProcessInterceptor());

		System.in.read();
	}

}
