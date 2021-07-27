package control.statements;

public class ForLoopTest {

	public void forLoopExample() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Iteration value is : " + i);
		}
	}

	public void forEachLoopExample() {
		
		int marks[] = {35,80,70,40,60};
		
		for (int mark : marks) {
			System.out.println("Marks is : " + mark);
		}
		
	}

	public static void main(String[] args) {
		ForLoopTest flt = new ForLoopTest();
		flt.forLoopExample();
		flt.forEachLoopExample();

	}

}
