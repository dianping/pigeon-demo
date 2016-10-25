package com.dianping.pigeon.demo;

import com.dianping.pigeon.remoting.invoker.concurrent.InvocationCallback;

public class EchoServiceCallback implements InvocationCallback {

	@Override
	public void onSuccess(Object result) {
		System.out.println("callback:" + result);
	}

	@Override
	public void onFailure(Throwable exception) {

	}

}
