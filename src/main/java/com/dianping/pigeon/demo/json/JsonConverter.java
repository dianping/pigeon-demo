package com.dianping.pigeon.demo.json;

import java.util.Date;

import com.dianping.pigeon.demo.UserService.User;
import com.dianping.pigeon.remoting.common.codec.json.JacksonSerializer;

public class JsonConverter {

	public static void main(String[] args) {
		JacksonSerializer serializer = new JacksonSerializer();
		Date d = new Date();
		
		User[] users = new User[]{new User("w"), new User("x")};
		Object[] a = new Object[]{users, 4};
		String str = serializer.serializeObject(a);
		System.out.println(str);
	}

}
