package oops;

public class Generic {
	
	ClassA ca = new ClassA();
	
	void demo() {
		System.out.println(ca.a);
		System.out.println(ca.b);
		ca.addition();
	}
	

	public static void main(String[] args) {
		Generic gen = new Generic();
		gen.demo();
	}

}
