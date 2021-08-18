package com.access.modifiers;

public class PublicTest {
	
	public String URL = "https://www.mycontactform.com/";
	public String USERNAME="autotestuser";
	public String PASSWORD="Ignorance123";
	
	public void accessSite() {
		System.out.println("Successfully accessed the site : " + URL);
	}
	
	public void verifyLogin() {
		System.out.println(USERNAME + " successfully logged into the application");
	}
	
	public PublicTest() {
		System.out.println("This is a public constructor..!");
	}

	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.accessSite();
		pt.verifyLogin();

	}

}
