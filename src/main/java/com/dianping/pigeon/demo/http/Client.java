/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.http;

import com.dianping.pigeon.demo.EchoService;
import com.dianping.pigeon.demo.UserService;
import com.dianping.pigeon.demo.UserService.User;
import com.dianping.pigeon.remoting.ServiceFactory;
import com.dianping.pigeon.remoting.invoker.config.InvokerConfig;

public class Client {

	public static void main(String[] args) throws Exception {
		String url = "http://service.dianping.com/com.dianping.pigeon.demo.EchoService";

		InvokerConfig<EchoService> echoConfig = new InvokerConfig<EchoService>(EchoService.class);
		echoConfig.setProtocol(InvokerConfig.PROTOCOL_HTTP);
		echoConfig.setSerialize(InvokerConfig.SERIALIZE_HESSIAN);
		echoConfig.setUrl(url);
		EchoService echoService = ServiceFactory.getService(echoConfig);

		InvokerConfig<UserService> userConfig = new InvokerConfig<UserService>(UserService.class);
		userConfig.setProtocol(InvokerConfig.PROTOCOL_HTTP);
		userConfig.setSerialize(InvokerConfig.SERIALIZE_JSON);
		UserService userService = ServiceFactory.getService(userConfig);

		System.out.println("echo service result:" + echoService.echo("echoService_input"));

		User user = new User();
		user.setUsername("scott");
		System.out.println("user service result:" + userService.getUserDetail(user, false));
	}

}
