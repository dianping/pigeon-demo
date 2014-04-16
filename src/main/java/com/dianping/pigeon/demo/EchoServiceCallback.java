package com.dianping.pigeon.demo;

import com.dianping.dpsf.async.ServiceCallback;
import com.dianping.dpsf.exception.DPSFException;

public class EchoServiceCallback implements ServiceCallback {


	@Override
	public void callback(Object result) {
		System.out.println("callback:" + result);
	}

	@Override
	public void serviceException(Exception e) {
		e.printStackTrace();
	}

	@Override
	public void frameworkException(DPSFException e) {
		e.printStackTrace();
	}

}
