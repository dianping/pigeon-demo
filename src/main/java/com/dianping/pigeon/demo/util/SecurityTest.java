package com.dianping.pigeon.demo.util;

import com.dianping.pigeon.remoting.common.util.SecurityUtils;

public class SecurityTest {

	public static void main(String[] args) {
		String serviceName = "com.dianping.pigeon.demo.thrift.EchoService";
		String methodName = "echo";
		String timestamp = "1479174804";
		String secret = "sssswwwe322rweefwe2434g4g341";

		System.out.println(SecurityUtils.encrypt(serviceName + "#" + methodName + "#" + timestamp, secret));
	}

}
