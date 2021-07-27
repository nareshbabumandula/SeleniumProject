package com.access.modifers;

public class PrivateTest {

	private int a=10;
	private int b=20;

	private void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}

	private void subtraction() {
		int c=b-a;
		System.out.println("Subtraction of a and b is : " + c);
	}
	
	private PrivateTest() {
		System.out.println("This is private constructor..!");
	}


	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
		pt.subtraction();
		
	}

}
