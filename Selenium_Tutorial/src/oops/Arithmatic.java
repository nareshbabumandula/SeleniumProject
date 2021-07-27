package oops;

public class Arithmatic {

	// State/Characteristics/Attributes/Data Members
	int a=10; // Instance variables
	int b=20;
	int c;
	byte d;

	// Behavior or action
	// addition : Method name
	void addition() {
		// Method body or implementation
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}

	void subtraction() {
		int c=a-b;
		System.out.println("subtraction of a and b is : " + c);
	}

	void multiplication() {
		int c=a*b;
		System.out.println("Multiplication of a and b is : " + c);
	}

	void division() {
		int c=b/a;
		System.out.println("Division of a and b is : " + c);
	}

	void modulus() {
		int c=b%a;
		System.out.println("Modulus of a and b is : " + c);
	}
	
	static void sum() {
		System.out.println("Executing sum method..!");
	}
	
	// No argument Constructor
	public Arithmatic() {
		System.out.println("This is an user defined no argument explicit constructor..!");
	}
	
	public static void main(String[] args) {

		// Create an object reference for the class
		// Syntax: Classname objRefName = new Constructor();
		Arithmatic arth = new Arithmatic();
		Arithmatic arth1 = new Arithmatic();
		Arithmatic arth2 = arth;
		arth.addition();
		arth.subtraction();
		arth.multiplication();
		arth.division();
		arth.modulus(); // Method call along with the object reference - arth
		System.out.println(arth.a);
		System.out.println(arth.b);
		System.out.println(arth.c);
		System.out.println(arth.d);
		sum(); // Method call along without object reference
		System.out.println(arth.toString());
		System.out.println(arth1.toString());
		System.out.println(arth2.toString());

	}

}
