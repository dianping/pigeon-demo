/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.api;

import com.dianping.pigeon.demo.EchoService;
import com.dianping.pigeon.remoting.ServiceFactory;

public class Client {

	public static void main(String[] args) throws Exception {
		String url = "com.dianping.pigeon.demo.EchoService";
		EchoService echoService = ServiceFactory.getService(url, EchoService.class);

		//InvocationCallback callback = new EchoServiceCallback();
//		EchoService serviceWithCallback = ServiceFactory.getService(url, EchoService.class, callback);
//		System.out.println("echoService result:" + echoService.echo("echoService_input"));
//		serviceWithCallback.echo("echoServiceWithCallback_input");
	}

}
