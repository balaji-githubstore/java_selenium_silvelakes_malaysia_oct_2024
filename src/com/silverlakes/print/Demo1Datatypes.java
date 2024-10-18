package com.silverlakes.print;

public class Demo1Datatypes {

	public static void main(String[] args) {
		
		int a=10; //a is reserved for int. 32 bits of memory
		
		a=100; 
		
		short b=100; //b is reserved for short. 16 bits of memory 
		
		byte c=100; // 8 bits of memory
		
		long d=100L; //64 bits of memory
		
		float e=188888888899999999999.12345678f; //32 bits
		
		double f=18888888888888888888888888888888888888.12345678; //64 bits
		
		boolean g=true; //1 bit
		
		char letter = 'b';//16 bits
		
		System.out.println(e);
		System.out.println(f);
		
		String myName="bala"; //4*16 bits 
		System.out.println(myName);
		
		System.out.println(myName.toUpperCase());
		
		System.out.println(myName.charAt(2));
		
	    int base1 = 25;
	    int height = 1;

	    //Calculate area of triangle 
	    double result1 = (base1 * height) / 2.0;
	    System.out.println(result1);
	    
	    int radius = 10;

	    double result = 3.14 * radius * radius;
	    System.out.println(result);
		
	}
}
