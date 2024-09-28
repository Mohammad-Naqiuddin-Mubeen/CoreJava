package com.excelr;

public class MethodVoidParameter {
	public void msg() {
		System.out.println("Methods From Method Void With Parameters");
	}
	
	public void add(int x, int y) {
		int z = x + y;
		System.out.println("Addition.... " + z);
	}
	public void sub(int x, int y) {
		int z = x - y;
		System.out.println("Substraction.... " + z);
	}
	public void mul(int x, int y) {
		int z = x * y;
		System.out.println("Multiplication.... " + z);
	}
	public void div(int x, int y) {
		int z = x / y;
		System.out.println("Division.... " + z);
	}
}
