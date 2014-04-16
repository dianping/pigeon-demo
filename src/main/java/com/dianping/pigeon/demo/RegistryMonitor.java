package com.dianping.pigeon.demo;

import com.dianping.pigeon.config.ConfigManager;
import com.dianping.pigeon.extension.ExtensionLoader;
import com.dianping.pigeon.registry.RegistryManager;
import com.dianping.pigeon.registry.exception.RegistryException;

public class RegistryMonitor {

	public static void main(String[] args) {
		String url = "http://service.dianping.com/com.dianping.pigeon.demo.EchoService";
		try {
			String ipList = RegistryManager.getInstance().getServiceAddress(url,
					ExtensionLoader.getExtension(ConfigManager.class).getGroup());
			System.out.println(ipList);
		} catch (RegistryException e) {
			System.out.println("exception!" + e.getMessage());
		}
	}
}
