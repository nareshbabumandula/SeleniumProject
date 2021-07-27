package oops;

public class C extends B{
	
	int a=40;
	int b=20;
	
	public void division(){
		int c=a/b;
		System.out.println("Division of a and b is : " + c);
	}
	
	public C() {
		System.out.println("This is a C class constructor..!");
	}

	public static void main(String[] args) {
		
		C c = new C();
		c.addition();
		c.subtraction();
		c.multiplication();
		c.division();
		System.out.println(c.a);
		System.out.println(c.b);

	}

}
