package oops;

public class MethodOverloadTest {
	
	/* Overloading: To achieve overloading we must have same named method within the class but with difference
	 * in the type of the parameters or no of parameters
	 * Concrete java methods, constructor and static methods can be overloaded 
	 * */
	
	static String USERNAME = "naresh";
		
	public void login() {
		System.out.println("Successfully logged into the application");
	}

	public void login(String USERNAME) {
		System.out.println("Successfully logged into the application with UserID : " + USERNAME);
	}
	
	public void login(String USERNAME, String PASSWORD) {
		System.out.println("Successfully logged into the application with UserID : " + USERNAME +  " and password : " + PASSWORD);
	}
	
	public MethodOverloadTest() {
		System.out.println("This is no argument constructor..!");
	}
	
	public MethodOverloadTest(String URL) {
		System.out.println("This is parameterized constructor with parameter  : " + URL);
	}
	
	static void accessSite() {
		System.out.println("Successfully accessed the site");
	}
	
	static void accessSite(String URL) {
		System.out.println("Successfully accessed the site with url - " + URL);
	}

	public static void main(String[] args) {
		
		MethodOverloadTest mot = new MethodOverloadTest();
		mot.login();
		mot.login("Manideep");
		mot.login("Ravi", "Secure*1234");
		accessSite();
		accessSite("https://www.mycontactform.com");
	}

}
