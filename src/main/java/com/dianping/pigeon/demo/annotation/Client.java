/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.annotation;

import com.dianping.pigeon.container.SpringContainer;

public class Client {

	private static SpringContainer CLIENT_CONTAINER = new SpringContainer(
			"classpath*:META-INF/spring/annotation/invoker.xml");

	public static void main(String[] args) throws Exception {
		CLIENT_CONTAINER.start();

		AnnotationTestService annotationTestService = (AnnotationTestService) CLIENT_CONTAINER
				.getBean("annotationTestService");
		System.out.println(annotationTestService.testEcho("annotationTestService_input"));
	}

}
