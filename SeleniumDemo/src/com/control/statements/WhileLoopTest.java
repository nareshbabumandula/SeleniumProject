package com.control.statements;

public class WhileLoopTest {
	

	public static void main(String[] args) {
	
		int num=1;
		
		while (num<10) {
			System.out.println("Number is : "  + num);
			num=num+1;
			if (num==6) {
				break;
			}
		}
		
			
	}

}
