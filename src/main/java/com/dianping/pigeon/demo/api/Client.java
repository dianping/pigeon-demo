/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.api;

import com.dianping.dpsf.async.ServiceCallback;
import com.dianping.pigeon.demo.EchoService;
import com.dianping.pigeon.demo.EchoServiceCallback;
import com.dianping.pigeon.demo.interceptor.MyInvokerProcessInterceptor;
import com.dianping.pigeon.remoting.ServiceFactory;
import com.dianping.pigeon.remoting.invoker.process.InvokerProcessInterceptorFactory;

public class Client {

	public static void main(String[] args) throws Exception {
		InvokerProcessInterceptorFactory.registerInterceptor(new MyInvokerProcessInterceptor());

		String url = "http://service.dianping.com/com.dianping.pigeon.demo.EchoService";
		EchoService echoService = ServiceFactory.getService(url, EchoService.class);

		ServiceCallback callback = new EchoServiceCallback();
		EchoService serviceWithCallback = ServiceFactory.getService(url, EchoService.class, callback);
		System.out.println("echoService result:" + echoService.echo("echoService_input"));
		serviceWithCallback.echo("echoServiceWithCallback_input");
	}

}
