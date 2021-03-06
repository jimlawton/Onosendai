package com.vaguehope.onosendai.storage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class VolatileKvStore implements KvStore {

	private final Map<String, String> m = new ConcurrentHashMap<String, String>();

	@Override
	public void storeValue (final String key, final String value) {
		this.m.put(key, value);
	}

	@Override
	public String getValue (final String key) {
		return this.m.get(key);
	}

}
