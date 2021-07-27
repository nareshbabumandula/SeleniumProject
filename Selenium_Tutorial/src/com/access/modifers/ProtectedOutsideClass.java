package com.access.modifers;

public class ProtectedOutsideClass {

	public static void main(String[] args) {
		System.out.println("Accessing protected constructor, variables and methods from outside the class");
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
		pt.subtraction();
	}

}
