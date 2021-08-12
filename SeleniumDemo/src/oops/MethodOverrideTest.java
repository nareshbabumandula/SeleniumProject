package oops;

public class MethodOverrideTest extends MethodOverloadTest{
	
	int a=40;
	
	void addition() {
		//int c=super.a+b;
		//int c=this.a+b;
		int c=a+b;
		System.out.println("Addition of a and b in subclass is : " +c);
	}
	
	/*
	 * Can we override a static method?
		No, we cannot override static methods because method overriding is based on dynamic binding at runtime and the static methods 
		are bonded using static binding at compile time. So, we cannot override static methods.

		The calling of method depends upon the type of object that calls the static method. It means:

		If we call a static method by using the parent class object, the original static method will be called from the parent class.
		If we call a static method by using the child class object, the static method of the child class will be called.
	 */
	static void addition(int a, int b, int c) {
		int d=a+b+c;
		System.out.println("Addition of a, b and c in subclass is : " +d);
	}
		
	void Demo() {
		System.out.println(super.a);
		System.out.println(this.a);
		super.addition();
		this.addition();
	}

	public static void main(char[] args) {
		System.out.println("This a main method with char as arguments..!");
	}
	
	public static void main(String[] args) {
		MethodOverrideTest mot = new MethodOverrideTest();
		mot.addition();
		mot.Demo();
		addition(10, 30, 40);

	}

}
