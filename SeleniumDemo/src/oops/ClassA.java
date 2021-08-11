package oops;

public class ClassA {

	// Instance variables
	int a=10;
	int b=20;

	void addition() {
		// Local variable
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}

	void subtraction() {
		int c=a-b;
		System.out.println("Subtraction of a and b is : " +c);
	}
	
	// No argument constructor
	public ClassA() {
		System.out.println("This is a no argument constructor..!");
	}
	
	// Parameterized argument constructor
	public ClassA(int a, int b) {
		System.out.println("This is a no parameterized constructor - " + a + " " + b);
	}
		
	public static void main(String[] args) {
		
		ClassA ca = new ClassA();
		System.out.println(ca.a);
		System.out.println(ca.b);
		ca.addition();
		ca.subtraction();

	}

}
