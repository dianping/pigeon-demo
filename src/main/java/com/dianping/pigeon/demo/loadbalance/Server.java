/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.loadbalance;

import com.dianping.pigeon.demo.SpringContainer;

public class Server {

	private static SpringContainer SERVER_CONTAINER = new SpringContainer(
			"classpath*:META-INF/spring/loadbalance/provider.xml");

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		SERVER_CONTAINER.start();

		System.in.read();
	}

}
