/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.http;

import com.dianping.pigeon.demo.EchoService;
import com.dianping.pigeon.remoting.ServiceFactory;
import com.dianping.pigeon.remoting.invoker.config.InvokerConfig;

public class Client {

	public static void main(String[] args) throws Exception {
		String url = "com.dianping.pigeon.demo.EchoService";

		InvokerConfig<EchoService> echoConfig = new InvokerConfig<EchoService>(EchoService.class);
		echoConfig.setProtocol(InvokerConfig.PROTOCOL_HTTP);
		echoConfig.setSerialize(InvokerConfig.SERIALIZE_HESSIAN);
		echoConfig.setUrl(url);
		echoConfig.setTimeout(2000);
		EchoService echoService = ServiceFactory.getService(echoConfig);


		System.out.println("echo service result:" + echoService.echo("echoService_input"));

	}

}
