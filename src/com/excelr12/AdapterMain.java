package com.excelr12;

public class AdapterMain {

	public static void main(String[] args) {
		
		Example1 de1 = Adapter.getInstance();
		
		de1.sqrt();
		de1.cube();
		
		Example2 de2 = Adapter2.getInstance();
		
		de2.sqrt(66);
		de2.cube(88);
	}

}
