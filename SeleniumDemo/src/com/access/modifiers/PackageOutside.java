package com.access.modifiers;

public class PackageOutside {

	public static void main(String[] args) {
		PackageTest pt = new PackageTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.accessSite();
		pt.verifyLogin();


	}

}
