/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.typical;

import com.dianping.pigeon.demo.EchoService;
import com.dianping.pigeon.demo.SpringContainer;
import com.dianping.pigeon.demo.UserService;
import com.dianping.pigeon.demo.UserService.User;

public class Client {

	private static SpringContainer CLIENT_CONTAINER = new SpringContainer(
			"classpath*:META-INF/spring/typical/invoker.xml");

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// ConfigCache.getInstance("dev.lion.dp");
		CLIENT_CONTAINER.start();

		EchoService echoService = (EchoService) CLIENT_CONTAINER.getBean("echoService");
		EchoService echoServiceWithCallback = (EchoService) CLIENT_CONTAINER.getBean("echoServiceWithCallback");

		UserService userService = (UserService) CLIENT_CONTAINER.getBean("userService");

		for (;;) {
			try {
				User user = new User();
				user.setUsername("wuxiang");
				System.out.println(userService.getUserDetail(user, true));

				System.out.println(echoService.echo("echoService_input"));
				echoServiceWithCallback.echo("echoServiceWithCallback_input");
			} catch (Throwable t) {
			}
		}
	}

}
