package com.access.modifiers;

public class PackageTest {
	
	 String URL = "https://www.mycontactform.com/";
	 String USERNAME="autotestuser";
	 String PASSWORD="Ignorance123";
	
	 void accessSite() {
		System.out.println("Successfully accessed the site : " + URL);
	}
	
	 void verifyLogin() {
		System.out.println(USERNAME + " successfully logged into the application");
	}
	
	public PackageTest() {
		System.out.println("This is a package constructor..!");
	}

	public static void main(String[] args) {
		PackageTest pt = new PackageTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.accessSite();
		pt.verifyLogin();

	}

}
