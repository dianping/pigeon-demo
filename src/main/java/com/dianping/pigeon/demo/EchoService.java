/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo;

import java.io.IOException;
import java.util.Map;

import com.dianping.pigeon.demo.UserService.User;

public interface EchoService {

	String echo(String input);

	String echo2(Map<User, Double> users, int size) throws IOException;
}
