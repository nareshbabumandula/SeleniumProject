package oops;

public class ClassC extends ClassB{
	
	void division() {
		int c = b/a;
		System.out.println("Division of a and b is : " + c);
	}

	public static void main(String[] args) {
		ClassC c = new ClassC();
		c.addition();
		c.subtraction();
		c.multiplication();
		c.division();
		System.out.println(c.a);
		System.out.println(c.b);

	}

}
