package com.excelr;

public class DataTypes {

	public static void main(String[] args) {
		byte b1 = 100;
		System.out.println(b1);
		
//		byte b2 = 128;
//		System.out.println(b2);
//		byte b3 = "Hello";	(error)
//		byte b4 = 100.1234;	(error)
		
		short s1 = 100;
		System.out.println(s1);
		
//		short s2 = 32768;
//		System.out.println(s2);		(compile time error)
		
		int num1 = 200;
		int num2 = 100;
		System.out.println(num1);
		System.out.println(num2);
		
		long l1 = 1234567891234545315l;
		System.out.println(l1);
		
		float f1 = 100.1234553f;
		System.out.println(f1);
		
		double d1 = 100.12345135131;
		System.out.println(d1);
		
		boolean flag1 = true;
		boolean flag2 = false;
		System.out.println(flag1);
		System.out.println(flag2);
		
//		boolean flag4 = "true";		(error)
//		boolean flag5 = True;		(error)
//		boolean flag6 = TRUE;		(error)
		
		char ch1 = 97;
		System.out.println(ch1);
		char ch2 = 100;
		System.out.println(ch2);
		char ch3 = 'z';
		System.out.println(ch3);
		
		/*		
		 * 	 DataType				SIZE						RANGE															WRAPPER CLASS			DEFAULT VALUE
		 *  --------------------------------------------------------------------------------------------------------------------------------------------------
		 * 
		 * 	1) byte					1 byte					-128 to 127													Byte								0
		 * 																(-2^7  to  2^7-1)
		 * 	2) short					2 bytes				-32768 to 32767											Short								0
		 * 																(-2^15  to  2^15-1)
		 * 	3) int						4 bytes				-2147483648  to 2147483647					Integer							0
		 * 																(-2^31  to  2^31-1)
		 * 	4) long					8 bytes				-2^63  to  2^63-1											Long								0
		 * 
		 * 	5) float					4 bytes				-3.4e38  to  3.4e38										Float								0
		 * 
		 * 	6) double				8 bytes				-1.7e308  to  1.7e308									Double							0
		 * 
		 * 	7) boolean				N/A						N/A																	Boolean							false
		 * 
		 * 	8)	char					2 bytes				0  -  65535														Character						space
		 * _________________________________________________________________________________________________________
		 */
	}

}
