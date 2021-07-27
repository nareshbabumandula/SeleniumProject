package control.statements;

public class BranchingTest {
	
	public void branchingExample() {
		
		for (int i = 0; i <= 10; i++) {
			if(i==5) {
				System.out.println("Iteration is : " + i);
				break;
			}else {
				System.out.println("Iteration is : " + i);
				continue;
			}
			
		}
	}

	public static void main(String[] args) {
		BranchingTest bt = new BranchingTest();
		bt.branchingExample();

	}

}
