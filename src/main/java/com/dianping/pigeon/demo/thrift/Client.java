/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.thrift;

import java.util.concurrent.Future;

import com.dianping.pigeon.container.SpringContainer;
import com.dianping.pigeon.remoting.invoker.util.InvokerHelper;

public class Client {

	private static SpringContainer CLIENT_CONTAINER = new SpringContainer(
			"classpath*:META-INF/spring/thrift/invoker.xml");

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		CLIENT_CONTAINER.start();

		EchoService echoService = (EchoService) CLIENT_CONTAINER.getBean("echoService");
		EchoService echoServiceWithCallback = (EchoService) CLIENT_CONTAINER.getBean("echoServiceWithCallback");
		EchoService echoServiceWithFuture = (EchoService) CLIENT_CONTAINER.getBean("echoServiceWithFuture");

		//while (true) {
			try {
				System.out.println(echoService.echo("scott thrift"));
				echoServiceWithCallback.echo("scott thrift callback");
				echoServiceWithFuture.echo("scott thrift future");
				Future<String> future = InvokerHelper.getFuture(String.class);
				System.out.println(future.get());
			} catch (Exception e) {

			}
		//}

	}

}
