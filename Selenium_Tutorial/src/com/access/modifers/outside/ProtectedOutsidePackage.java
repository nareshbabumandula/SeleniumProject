package com.access.modifers.outside;

import com.access.modifers.ProtectedTest;
import com.access.modifers.PublicTest;

public class ProtectedOutsidePackage extends ProtectedTest{

	public static void main(String[] args) {
		System.out.println("Accessing protected constructor, variables and methods from outside the package only via inheritance");
//		ProtectedTest pt = new ProtectedTest();
//		System.out.println(pt.a);
//		System.out.println(pt.b);
//		pt.addition();
//		pt.subtraction();
		
		ProtectedOutsidePackage pop = new ProtectedOutsidePackage();
		System.out.println(pop.a);
		System.out.println(pop.b);
		pop.addition();
		pop.subtraction();
		
		

	}

}
