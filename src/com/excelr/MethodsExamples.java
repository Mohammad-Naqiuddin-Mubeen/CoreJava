package com.excelr;

public class MethodsExamples {
	public void m1() {
		System.out.println("Welcome To METHODS");
	}
	
	public static void main(String[] args) {
		//create Object
		MethodsExamples methodsExamples = new MethodsExamples();
		methodsExamples.m1();
//		
		MethodVoid mVoid = new MethodVoid();
		mVoid.msg();
		mVoid.add();
		mVoid.sub();
		mVoid.mul();
		mVoid.div();
		
		MethodVoidParameter mVoidParameter = new MethodVoidParameter();
		mVoidParameter.msg();
		mVoidParameter.add(65, 87);
		mVoidParameter.sub(97, 53);
		mVoidParameter.mul(49, 87);
		mVoidParameter.div(55, 25);
		
		MethodReturnNoParameter mReturnNoParameter = new MethodReturnNoParameter();
		mReturnNoParameter.msg();
		int x = mReturnNoParameter.m1();
		System.out.println(x);
		byte b1 = mReturnNoParameter.m2();
		System.out.println(b1);
		short s1 = mReturnNoParameter.m3();
		System.out.println(s1);
		long l1 = mReturnNoParameter.m4();
		System.out.println(l1);
		char c1 = mReturnNoParameter.m5();
		System.out.println(c1);
		float f1 = mReturnNoParameter.m6();
		System.out.println(f1);
		double d1 = mReturnNoParameter.m7();
		System.out.println(d1);
		boolean flag = mReturnNoParameter.m8();
		System.out.println(flag);
		
		MethodReturnParameter mReturnParameter = new MethodReturnParameter();
		mReturnParameter.msg();
		int i = mReturnParameter.add(100, 50);
		System.out.println(i);
		int j = mReturnParameter.sub(100, 50);
		System.out.println(j);
		int k = mReturnParameter.mul(100, 50);
		System.out.println(k);
		int l = mReturnParameter.div(100, 50);
		System.out.println(l);
		
//		Test1 test1 = new Test1();
//		test1.m1();
		
		Demo2 d = new Demo2();
		Demo1 y = d.m2();
		y.m1();
		
		Sample3 S3 = new Sample3();
		Sample1 S1 =  S3.m5();
		S1.m1();
		S1.m2();
		Sample2 S2 = S3.m6();
		S2.m3();
		S2.m4();
		
		
		
		
		
		
		
	}

}
