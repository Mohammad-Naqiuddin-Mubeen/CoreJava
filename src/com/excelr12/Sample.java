package com.excelr12;

public class Sample {

	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		d1.add();
		
		Demo2 d2 = new Demo2();
		int res1 = d2.add();
		System.out.println(res1);
		
		Demo3 d3 = new Demo3();
		d3.add(66, 88);
		
		Demo4 d4 = new Demo4();
		int res2 = d4.add(37, 45);
		System.out.println(res2);

	}

}
