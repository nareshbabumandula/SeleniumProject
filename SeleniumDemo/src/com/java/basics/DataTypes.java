package com.java.basics;

public class DataTypes {

	// Java is statically typed programming language since the type checking happens at compile time
	// Java is a dynamic programming language since the memory allocation for primitive happens at run-time
	
	// Instance variables
	byte b = 127;
	short s = 2344;
	int i = 536667;
	long l = 346453676;
	float f = 12.5f;
	double d = 1254.45656;
	char c = 't';
	boolean bflag = true;
	
	
	public static void main(String[] args) {
		
		//Create an object reference for the class
		// Syntax: Classname objRef = new Constructor();
		DataTypes dt = new DataTypes();
		System.out.println("Byte value is : " + dt.b);
		System.out.println("Short value is : " + dt.s);
		System.out.println(dt.i);
		System.out.println(dt.l);
		System.out.println(dt.f);
		System.out.println(dt.d);
		System.out.println(dt.c);
		System.out.println(dt.bflag);
		
		/*Wrapper Classes are available for all primitives (byte, short, int, long, float, double, 
		char, boolean)*/
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
	}

}
