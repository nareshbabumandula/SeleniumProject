package casting.demo;

class Parent {
	int a=10;
	void Demo() {
		System.out.println("Demo method from Parent class");
	}

}

class Child extends Parent{
	int a=20;
	void Demo() {
		System.out.println("Demo method from Child class");
	}
}


public class UpCastingTest{
	/* In upcasting the child object is typecasted to a parent object
	 * We can easily access the variables and methods of parent to the child class
	 * */
	
	public static void main(String args[]) {
		
		Parent p = new Child(); // Upcasting
		p.Demo();
		System.out.println(p.a);
		
		//Downcasting
		//Child c = new Parent(); // Compilation error
		Child c = (Child)p;
		c.Demo();
		System.out.println(c.a);
	}
	
}

