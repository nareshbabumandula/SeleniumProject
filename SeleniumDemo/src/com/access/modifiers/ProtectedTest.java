package com.access.modifiers;

public class ProtectedTest {
	
	protected String URL = "https://www.mycontactform.com/";
	protected String USERNAME="autotestuser";
	protected String PASSWORD="Ignorance123";
	
	protected void accessSite() {
		System.out.println("Successfully accessed the site : " + URL);
	}
	
	protected void verifyLogin() {
		System.out.println(USERNAME + " successfully logged into the application");
	}
	
	public ProtectedTest() {
		System.out.println("This is a protected constructor..!");
	}

	public static void main(String[] args) {
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.accessSite();
		pt.verifyLogin();

	}

}
