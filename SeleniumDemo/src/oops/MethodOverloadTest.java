package oops;

public class MethodOverloadTest {
	
	int a=10;
	int b=20;
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}
	
	void addition(int a, int b) {
		int c=a+b;
		System.out.println("Addition with arguments a and b is : " +c);
	}
	
	void addition(double a, double b) {
		double c=a+b;
		System.out.println("Addition with double a and b is : " +c);
	}
	
	static void addition(int a, int b, int c) {
		int d=a+b+c;
		System.out.println("Addition of a, b and c is : " +d);
	}
	
	static void addition(int a) {
		int b=a+10;
		System.out.println("Addition of a is : " +b);
	}
	
	public MethodOverloadTest() {
		System.out.println("This is a no argument constructor");
	}
	
	public MethodOverloadTest(int a, int b) {
		System.out.println("This is a no parameterized constructor with parameters - " + a + "," + b);
	}

	public static void main(String[] args) {
		
		MethodOverloadTest mot = new MethodOverloadTest();
		mot.addition();
		addition(100);
		addition(10, 20, 30);
		mot.addition(12.3432, 523.23235);
	}

}
