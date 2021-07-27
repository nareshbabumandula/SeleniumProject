package oops;

public class StackTest {

	public void m1() {
		// Method m2 call
		m2();
		
		int a=10;
		int b=20;
		System.out.println("Addition of a and b is : " + (a+b));
	}

	public void m2() {
		// Call method m3
		m3();
		int a=10;
		int b=20;	
		System.out.println("Subtraction of a and b is : " + (a-b));
	}

	public void m3() {
		int a=10;
		int b=20;
		System.out.println("Multiplication of a and b is : " + (a*b));
	}


	public static void main(String[] args) {
		
		StackTest st = new StackTest();
		st.m1();

	}

}
