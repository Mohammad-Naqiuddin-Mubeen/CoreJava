package com.excelr;

public class ClassExampleMain {

	public static void main(String[] args) {
		
		ClassExample cExample = new ClassExample();
		cExample.m1();
		int res1 = cExample.m2();
		System.out.println(res1);
		cExample.m3(10);
		int res2 = cExample.m4(10);
		System.out.println(res2);
		
		ClassExample1.m1();
		int res3 = ClassExample1.m2();
		System.out.println(res3);
		ClassExample1.m3(20);
		int res4 = ClassExample1.m4(20);
		System.out.println(res4);

	}

}
