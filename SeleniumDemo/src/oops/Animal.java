package oops;

public class Animal {
	
	// Object : Anything which has state and behavior is called as an object
	// Class : It is a template or a blue print or a place holder using which an object is formed

	// Characteristics or properties or state
	String name = "jimmy";
	int age = 10;
	String color = "white";
	String type = "pet";
	String breed;
	int speed;

	// Behavior  or action or method
	public void run() {
		int age =12;  // Local variable
		System.out.println("Local variable value of age is  : " + age);
		// Implementation
		System.out.println("Dog can run even at the age of : " +age);
	}

	public void walk() {
		System.out.println("Dog can walk");
	}

	public void bite() {
		System.out.println(name + " can bite");
	}
	
	public void bark() {
		System.out.println("Dog can bark");
	}
	
	public void animaltype() {
		System.out.println(name + " is a " + type + " animal");
	}


	public static void main(String[] args) {
		
		Animal an = new Animal();
		System.out.println(an.name);
		System.out.println(an.age);
		System.out.println(an.color);
		System.out.println(an.type);
		System.out.println(an.breed);
		System.out.println(an.speed);
		an.walk();
		an.run();
		an.bark();
		an.bite();
		an.animaltype();
		System.out.println(an.age);

	}

}
