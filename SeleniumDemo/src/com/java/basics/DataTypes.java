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
		
		/*Type casting: The process of converting one data type of another data type
		In Java we have two types of type casting
			1. Primitive data types type casting
			2. User defined data types type casting
		*
		*	1. Primitive data types type casting
		*		
		*		i. Implicit type casting - lower to high data type (byte -> short -> int -> long -> float -> double)
		*       ii. Explicit type casting
		*/
		
		//i. Implicit type casting
		byte b1 = 126;
		short s1 = b1;
		System.out.println("Converted the byte value to short value : " + s1);
		System.out.println(b1 + " " + s1);
		
		/*int a1 = 100;
		byte b2 = a1;
		System.out.println(a1 + " " +b2);
				
		byte b3 = 62;
		char c1 = b3;
		System.out.println(b3 + " " + c3);
		
		byte b4 = 130;
		System.out.println(b4);*/
		
		/*ii. Explicit type casting
			To perform explicit type casting we have to use the following pattern
			P a = (Q) b;
			(Q) ---> Cast Operator and P and Q are primitive data types, where Q must be either same as P or lower than P as per
			implicit type casting flow
		*/
		
		int a5 = 130;
		byte b5 = (byte)a5;
		System.out.println(a5 + " " +b5);
		
		
		int a1 = 130;
		short b2 = (byte)a1;
		System.out.println(a1 + " " +b2);
		
		
		
		
		
		
		
		
		
	}

}
