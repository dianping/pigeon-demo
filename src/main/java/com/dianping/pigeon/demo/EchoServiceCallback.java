package com.dianping.pigeon.demo;

import org.apache.log4j.Logger;

import com.dianping.dpsf.async.ServiceCallback;
import com.dianping.dpsf.exception.DPSFException;
import com.dianping.pigeon.log.LoggerLoader;

public class EchoServiceCallback implements ServiceCallback {

	private static final Logger logger = LoggerLoader.getLogger(EchoServiceCallback.class);

	@Override
	public void callback(Object result) {
		System.out.println("callback:" + result);
	}

	@Override
	public void serviceException(Exception e) {
		logger.error("", e);
	}

	@Override
	public void frameworkException(DPSFException e) {
		logger.error("", e);
	}

}
