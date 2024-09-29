package com.excelr;

public class VariablesDemo {
	int x = 10;
	static int y = 20;
	
	public static void main(String[] args) {
		
		VariablesDemo ref1 = new VariablesDemo();
		ref1.x = 1000;
		VariablesDemo.y = 2000;
		
		VariablesDemo ref2 = new VariablesDemo();
		
		System.out.println(ref1.x + "......." + ref1.y);
		System.out.println(ref2.x + "......." + ref2.y);
	}

}
