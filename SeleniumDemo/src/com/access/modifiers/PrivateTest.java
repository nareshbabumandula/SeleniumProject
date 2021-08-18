package com.access.modifiers;

public class PrivateTest {
	
	private String URL = "https://www.mycontactform.com/";
	private String USERNAME="autotestuser";
	private String PASSWORD="Ignorance123";
	
	private void accessSite() {
		System.out.println("Successfully accessed the site : " + URL);
	}
	
	private void verifyLogin() {
		System.out.println(USERNAME + " successfully logged into the application");
	}
	
	public PrivateTest() {
		System.out.println("This is a private constructor..!");
	}

	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.accessSite();
		pt.verifyLogin();

	}

}
