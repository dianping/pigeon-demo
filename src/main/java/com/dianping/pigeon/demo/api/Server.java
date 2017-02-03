/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.api;

import com.dianping.pigeon.demo.EchoService;
import com.dianping.pigeon.demo.EchoServiceDefaultImpl;
import com.dianping.pigeon.remoting.ServiceFactory;
import com.dianping.pigeon.remoting.provider.config.ProviderConfig;

public class Server {

	public static void main(String[] args) throws Exception {
		ProviderConfig<EchoService> providerConfig = new ProviderConfig<EchoService>(EchoService.class,
				new EchoServiceDefaultImpl());
		String url = "com.dianping.pigeon.demo.EchoService";
		providerConfig.setUrl(url);
		ServiceFactory.addService(providerConfig);

		System.in.read();
	}

}
