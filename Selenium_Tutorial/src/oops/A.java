package oops;

class A{
	
	int a=10;
	int b=20;
	static int d=100;
	
	/*
	 * static block: The static block is a block of statement inside a Java class
	 * that will be executed when a class is first loaded into the JVM.
	 * A static block helps to initialize the static data members, just like 
	 * constructors help to initialize instance members. 
	 */
	static {
		System.out.println("This is a static block of A class..!");
	}
	
	/*
	 * Instance block is an element of a class which serves the same two purposes as
	 * served by the constructors. These two purposes are- Just like constructors,
	 * instance blocks can be used to initialize the instance variables during
	 * object creation.
	 */
	{
		System.out.println("This is an instance block of a class..!");
	}

	/*
	 * The purpose of constructor is to initialize the object of a class while the
	 * purpose of a method is to perform a task by executing java code. Constructors
	 * cannot be abstract, final, static and synchronized while methods can be.
	 * Constructors do not have return types while methods do.
	 */
	public A() {
		System.out.println("This is a constructor of A class..!");
	}
	
	public void addition(){
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}
	
	
	
	public void subtraction(){
		int c=a-b;
		System.out.println("Subtraction of a and b is : " + c);
	}
}
