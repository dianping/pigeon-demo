package com.dianping.pigeon.demo.json;

import java.util.Date;

import com.dianping.pigeon.remoting.common.codec.json.JacksonSerializer;

public class JsonConverter {

	public static void main(String[] args) {
		JacksonSerializer serializer = new JacksonSerializer();
		Date d = new Date();
		String str = serializer.serializeObject(d);
		System.out.println(str);
	}

}
