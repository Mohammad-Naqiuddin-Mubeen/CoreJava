package com.proxy;

public class Sample {

	public static void main(String[] args) {
		
		Adapter adapter = Proxy.getInstance();
		Demo1 demo1 = adapter.getInstance();
		String string = demo1.msg();
		
		System.out.println(string);

	}

}
