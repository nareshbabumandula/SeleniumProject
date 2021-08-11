package oops;

public class ClassB extends ClassA {
	
	void multiplication() {
		int c =a*b;
		System.out.println("Multiplication of a and b is : " +c);
		
	}

	public static void main(String[] args) {
		ClassB cb = new ClassB();
		System.out.println(cb.a);
		System.out.println(cb.b);
		cb.addition();
		cb.subtraction();
		cb.multiplication();
	}

}
