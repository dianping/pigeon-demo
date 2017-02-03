package com.dianping.pigeon.demo.interceptor;

import com.dianping.pigeon.remoting.invoker.domain.InvokerContext;
import com.dianping.pigeon.remoting.invoker.process.InvokerInterceptor;

public class MyInvokerInterceptor implements InvokerInterceptor {


	@Override
	public void preInvoke(InvokerContext invokerContext) {
		//System.out.println("preInvoke:" + invokerContext.getRequest());		
	}

	@Override
	public void postInvoke(InvokerContext invokerContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterThrowing(InvokerContext invokerContext, Throwable throwable) {
		// TODO Auto-generated method stub
		
	}

}
