package oops;

import oops.B.C;

public class A {
	
	String USERNAME = "naresh";
	String PASSWORD = "Secure*123";
	String URL = "https://mycontactform.com/";
		
	void accessSite() {
		System.out.println("Accessed the site : " + URL);		
	}
	
	void login() {
		System.out.println(USERNAME + " - successfully logged into the application");
	}
	

	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.URL);
		System.out.println(a.USERNAME);
		System.out.println(a.PASSWORD);
		a.accessSite();
		a.login();
				
	}

}

class B extends A{
	
	void searchProduct(String Product) {
		System.out.println("Successfully searched the product - " + Product);
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		System.out.println(b.URL);
		System.out.println(b.USERNAME);
		System.out.println(b.PASSWORD);
		b.accessSite();
		b.login();
		b.searchProduct("iPhone");
	}
	
	class C{
		int a=10;
		
		void addtoCart(String strProduct) {
			System.out.println("Successfully added the product '" +strProduct+ "' to the cart");
		}
	}
}
