package com.dianping.pigeon.demo.http;

import java.util.ArrayList;
import java.util.List;

import com.dianping.pigeon.demo.UserService.User;
import com.dianping.pigeon.remoting.common.codec.json.JacksonSerializer;

public class JsonStringGenerator {

	public static void main(String[] args) {
		User user = new User();
		user.setUsername("wuxiang");
		List<User> users = new ArrayList<User>();
		users.add(user);

		JacksonSerializer serializer = new JacksonSerializer();
		String str = serializer.serializeObject(users);
		System.out.println(str);
	}

}
