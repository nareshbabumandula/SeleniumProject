package oops;

public class MethodOverrideTest extends MethodOverloadTest{

	static String USERNAME = "gunjan";

	public void login() {
		System.out.println("Successfully logged into the application in subclass"); 
	}


	public static void main(String[] args) {
		MethodOverrideTest mot = new MethodOverrideTest();
		mot.login();
		System.out.println(MethodOverloadTest.USERNAME);
	}

}
