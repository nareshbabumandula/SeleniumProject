package oops;

public class Toyoto extends Car{

	public static void main(String[] args) {
		Toyoto toy = new Toyoto();
		toy.Airbags();
		toy.ABS();
		toy.AutomaticGearSystem();
		toy.Speed();
		Model();
	}

	void Airbags() {
		System.out.println("6 airbags are available in all models of toyoto cars..!");
		
	}


	void AutomaticGearSystem() {
		System.out.println("AutomaticGearSystem system is availble in all toyoto cars..!");
		
	}


	void ABS() {
		System.out.println("ABS is availble in all toyoto cars..!");
	}

}
