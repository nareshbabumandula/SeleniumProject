package control.statements;

public class WhileLoopTest {

	public void whileLoopExample() {

		int i = -10;
		while (i <= 10) {
			System.out.println("Iteration value is : " + i);
			i = i + 1; // increment value by 1
		}
	}

	public void dowhileLoopExample() {

		int i = 1;
		do {
			System.out.println("Iteration value is : " + i);
			i = i + 1; // increment value by 1
		}while(i<=10);

	}

	public static void main(String[] args) {

		WhileLoopTest wlt = new WhileLoopTest();
		wlt.whileLoopExample();
		wlt.dowhileLoopExample();
	}

}
