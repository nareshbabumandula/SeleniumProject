package com.control.statements;

public class ForLoopTest {
	
	public void forLoopExample() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Iteration : " +i);
		}
		
	}
	
	public void enhancedForLoop() {
		
		String[] names = {"Monali", "Himaja", "Sheshu", "Shaan", "Swetha", "Gopi", "Mounika"};
		
		for (String student : names) {
			System.out.println(student + "-" + student.length());
			if (student=="Shaan") {
				break;
			}
		}
	
	}
	
	public void sumofNumbers(int num) {
		
		int sum=0;
		
		for (int i = 0; i<=num; i++) {
			sum = sum+i;
		}
		System.out.println("Sum is : " + sum);
		
	}
	


	public static void main(String[] args) {
		
		ForLoopTest flt = new ForLoopTest();
		//flt.forLoopExample();
		//flt.enhancedForLoop();
		flt.sumofNumbers(5);

	}

}
