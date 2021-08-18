package com.access.modifiers;

public class ProtectedOutside {

	public static void main(String[] args) {
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.accessSite();
		pt.verifyLogin();

	}

}
