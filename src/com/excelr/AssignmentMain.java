package com.excelr;

public class AssignmentMain {

	public static void main(String[] args) {
		
		AssignmentInstance aInstance = new AssignmentInstance();
		int res1 = aInstance.x;
		System.out.println(res1);
		byte res2 = aInstance.b;
		System.out.println(res2);
		short res3 = aInstance.s;
		System.out.println(res3);
		
		long res4 = AssignmentStatic.l;
		System.out.println(res4);
		boolean res5 = AssignmentStatic.flag;
		System.out.println(res5);
		double res6 = AssignmentStatic.d;
		System.out.println(res6);
	}

}
 