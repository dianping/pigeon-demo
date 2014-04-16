/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class SpringContainer {

	public String DEFAULT_SPRING_CONFIG = "classpath*:META-INF/spring/*.xml";

	private static ClassPathXmlApplicationContext context;

	private static volatile boolean isStartup = false;

	public SpringContainer() {

	}

	public SpringContainer(String path) {
		DEFAULT_SPRING_CONFIG = path;
	}

	public ClassPathXmlApplicationContext getContext() {
		return context;
	}

	public void setParentContext(ApplicationContext parentContext) {
		context.setParent(parentContext);
	}

	public Object getBean(String beanName) {
		return context.getBean(beanName);
	}

	public void start() {
		if (!isStartup) {
			synchronized (this) {
				if (!isStartup) {
					String configPath = DEFAULT_SPRING_CONFIG;
					try {
						context = new ClassPathXmlApplicationContext(configPath.split("[,\\s]+"));
						context.start();
					} catch (Exception e) {
						throw new RuntimeException("error while start spring context:" + configPath, e);
					}
				}
			}
		}
	}

	public void stop() {
		try {
			if (context != null) {
				context.stop();
				context.close();
				context = null;
			}
		} catch (Throwable e) {
			
		}
	}

}