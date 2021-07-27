package oops;

class B extends A{
	
	public void multiplication(){
		int c=a*b;
		System.out.println("Multiplication of a and b is : " + c);
	}
	
	public B() {
		System.out.println("This is a B class constructor..!");
	}
	
	public static void main(String[] args){

		B b = new B();
		System.out.println(b.a);
		System.out.println(b.b);
		b.addition();
		b.subtraction();
		b.multiplication();


	}
}
