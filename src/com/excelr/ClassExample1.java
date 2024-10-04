package com.excelr;

public class ClassExample1 {
	public static void m1() {
		System.out.println("From Static M1");
	}
	public static int m2() {
		return 200;
	}
	public static void m3(int x) {
		System.out.println(x*x);
	}
	public static int m4(int x) {
		return x*x*x;
	}
	public static void main(String[] args) {
		
		ClassExample1.m1();
		int res1 = ClassExample1.m2();
		System.out.println(res1);
		ClassExample1.m3(20);
		int res2 = ClassExample1.m4(20);
		System.out.println(res2);
	}

}
