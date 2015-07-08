package com.dianping.pigeon.demo.loadbalance;

import java.util.List;

import com.dianping.pigeon.remoting.common.domain.InvocationRequest;
import com.dianping.pigeon.remoting.invoker.Client;
import com.dianping.pigeon.remoting.invoker.config.InvokerConfig;
import com.dianping.pigeon.remoting.invoker.route.balance.WeightedAutoawareLoadBalance;

public class MyLoadbalance extends WeightedAutoawareLoadBalance {

	@Override
	public Client doSelect(List<Client> clients, InvokerConfig<?> invokerConfig, InvocationRequest request,
			int[] weights) {
		if ("http://service.dianping.com/com.dianping.pigeon.demo.EchoService".equals(request.getServiceName())
				&& "echo".equals(request.getMethodName())) {
			if (request.getParameters().length > 0) {
				Object p0 = request.getParameters()[0];
				if (p0 != null) {
					return clients.get(Math.abs(p0.hashCode() % clients.size()));
				}
			}
		}
		return super.doSelect(clients, invokerConfig, request, weights);
	}

}
