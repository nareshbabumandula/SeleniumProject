package com.access.modifiers;

public class PublicOutside {

	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.accessSite();
		pt.verifyLogin();
	}

}
