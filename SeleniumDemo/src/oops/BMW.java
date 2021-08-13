package oops;

public class BMW extends Car{
	
	String car="BMW";
	static double basicprice = 350000.00;


	public static void main(String[] args) {
		BMW b = new BMW();
		b.musicSystem();
		b.carGearType("Manual");
		b.ABS();
		b.License();
		b.lights();
		b.wheels();
		b.wiper();
		b.Color();
		b.airbags();
		b.price(basicprice);
		steeringType("Power Steering");
		
	}

	@Override
	void wheels() {
		System.out.println(car + " has 4 wheels");
	}

	@Override
	void License() {
		System.out.println(car + " is a licensed car");
	}

	@Override
	void ABS() {
		System.out.println(car + " has ABS inbuilt");
	}

	@Override
	void airbags() {
		System.out.println(car + " has 4 airbags");
	}

	@Override
	void wiper() {
		System.out.println(car + " has front and rear window wipers");
	}

	@Override
	void lights() {
		System.out.println(car + " has front and rear lights");
		
	}

	@Override
	void Color() {
		System.out.println("BMW car is available in white, blue, red, metallic and yellow colors");
		
	}

	@Override
	void price(double price) {
		System.out.println("Price is the BMW basic model is : " + basicprice + " lakhs");
		
	}

}
