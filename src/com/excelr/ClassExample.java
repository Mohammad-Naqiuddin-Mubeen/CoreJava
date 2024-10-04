package com.excelr;

public class ClassExample {
	public void m1() {
		System.out.println("From M1");
	}
	public int m2() {
		return 100;
	}
	public void m3(int x) {
		System.out.println(x*x);
	}
	public int m4(int x) {
		return x*x*x;
	}
	
	public static void main(String[] args) {
		
		ClassExample cExample = new ClassExample();
		cExample.m1();
		int res1 = cExample.m2();
		System.out.println(res1);
		cExample.m3(10);
		int res2 = cExample.m4(10);
		System.out.println(res2);

	}

}
