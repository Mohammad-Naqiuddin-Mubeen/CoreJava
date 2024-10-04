package com.proxy;

public class Proxy {
	public static Adapter getInstance() {
		Adapter adapter = new Adapter();
		return adapter;
	}
}
