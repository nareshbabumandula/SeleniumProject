package com.access.modifers;

public class ProtectedTest {

	protected int a=10;
	protected int b=20;

	protected void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}

	protected void subtraction() {
		int c=b-a;
		System.out.println("Subtraction of a and b is : " + c);
	}
	
	protected ProtectedTest() {
		System.out.println("This is protected constructor..!");
	}


	public static void main(String[] args) {
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
		pt.subtraction();
		
	}

}
