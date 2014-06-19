package com.dianping.pigeon.demo.loadbalance;

import java.util.List;

import com.dianping.pigeon.remoting.common.domain.InvocationRequest;
import com.dianping.pigeon.remoting.invoker.Client;
import com.dianping.pigeon.remoting.invoker.route.balance.RoundRobinLoadBalance;

public class MyLoadbalance extends RoundRobinLoadBalance {

	@Override
	protected Client doSelect(List<Client> clients, InvocationRequest request, int[] weights) {
		if ("http://service.dianping.com/com.dianping.pigeon.demo.EchoService".equals(request.getServiceName())
				&& "echo".equals(request.getMethodName())) {
			if (request.getParameters().length > 0) {
				Object p0 = request.getParameters()[0];
				if (p0 != null) {
					return clients.get(Math.abs(p0.hashCode() % clients.size()));
				}
			}
		}
		return super.doSelect(clients, request, weights);
	}

}
