package oops;

public abstract class Car {
	
	// static block
	static {
		System.out.println("Executing static block..!");
	}
	
	// Instance block
	{
		System.out.println("Executing instance block..!");
	}
		
	// Non abstract method or concrete method
	void musicSystem() {
		System.out.println("Good to have a music system");
	}
	
	void carGearType(String gearType) {
		System.out.println("Car gear type is : " + gearType);
	}
	
	static void steeringType(String steeringType) {
		System.out.println("Steering type is : " + steeringType);
	}
		
	// abstract or bodyless method
	abstract void wheels();
	
	abstract void License();
	
	abstract void ABS();
	
	abstract void airbags();
	
	abstract void wiper();
	
	abstract void lights();
	
	abstract void Color();
	
	abstract void price(double price);
	
	public Car() {
		System.out.println("No argument constructor of an abstract class");
	}
		

	public static void main(String[] args) {
		
		//Car c = new Car();
	}

}
