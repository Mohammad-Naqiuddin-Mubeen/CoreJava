package com.excelr;

public class MethodReturnParameter {
	public void msg() {
		System.out.println("Methods From Method With Return And Parameters");
	}
	
	public int add(int x,int y) {
		int z = x + y;
		return z;
	}
	public int sub(int x,int y) {
		int z = x - y;
		return z;
	}
	public int mul(int x,int y) {
		int z = x * y;
		return z;
	}
	public int div(int x,int y) {
		int z = x / y;
		return z;
	}
}
