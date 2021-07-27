package com.access.modifers;

public class DefaultTest {

	int a=10;
	int b=20;

	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}

	void subtraction() {
		int c=b-a;
		System.out.println("Subtraction of a and b is : " + c);
	}
	
	DefaultTest() {
		System.out.println("This is public constructor..!");
	}


	public static void main(String[] args) {
		DefaultTest pt = new DefaultTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
		pt.subtraction();
		
	}

}
