/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.typical;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.dianping.pigeon.container.SpringContainer;
import com.dianping.pigeon.demo.EchoService;
import com.dianping.pigeon.remoting.invoker.util.InvokerHelper;

public class Client {

	private static SpringContainer CLIENT_CONTAINER = new SpringContainer(
			"classpath*:META-INF/spring/typical/invoker.xml");
	private static ExecutorService pool = Executors.newFixedThreadPool(50);

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		CLIENT_CONTAINER.start();

		final EchoService echoService = (EchoService) CLIENT_CONTAINER.getBean("echoService");
		final EchoService echoServiceWithCallback = (EchoService) CLIENT_CONTAINER.getBean("echoServiceWithCallback");
		final EchoService echoServiceWithFuture = (EchoService) CLIENT_CONTAINER.getBean("echoServiceWithFuture");

		// pool.execute(new Runnable(){
		//
		// @Override
		// public void run() {
		// while (true) {
		// try {
		System.out.println(echoService.getUser("scott"));
		System.out.println(echoService.echo("scott"));
		echoServiceWithCallback.echo("scott callback");
		echoServiceWithFuture.echo("scott future");
		Future<String> future = InvokerHelper.getFuture(String.class);
		System.out.println(future.get());
		// } catch (Exception e) {
		// }
		// }
		// }

		// });

	}

}
