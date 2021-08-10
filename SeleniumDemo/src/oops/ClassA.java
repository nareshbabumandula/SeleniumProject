package oops;

public class ClassA {

	int a=10;
	int b=20;

	public void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}

	public void subtraction() {
		int c=a-b;
		System.out.println("Subtraction of a and b is : " +c);
	}

	public static void main(String[] args) {
		
		ClassA ca = new ClassA();
		System.out.println(ca.a);
		System.out.println(ca.b);
		ca.addition();
		ca.subtraction();

	}

}
