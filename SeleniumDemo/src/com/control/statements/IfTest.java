package com.control.statements;

public class IfTest {
	
	int a = 10;
	int b = 5;
	
	
	public void ifExample() {
		if (a<b) {
			System.out.println("a is less than b");
		}
	}
	
	public void ifElseExample() {
		if (a<b) {
			System.out.println("a is less than b");
		}else {
			System.out.println("a is greater than b");
		}
	}
	
	public void ifElseIfElseExample() {
		if (a<b) {
			System.out.println("a is less than b");
		}else if(a==b) {
			System.out.println("a is equal to b");
		}else {
			System.out.println("a is greater than b");
		}
	}
	
	public void enhancedIf() {
		if (a>b) System.out.println("a is greater than b");
		else if(a==b) System.out.println("a is equal to b");
		else System.out.println("a is less than b");
	}
	
	
	public void verifyEvenOdd(int num) {
		
		if (num%2==0) {
			System.out.println(num + " : is an even number");
		} else {
			System.out.println(num + " : is an odd number");
		}
		
	}
	

	public static void main(String[] args) {
		IfTest it = new IfTest();
		//it.ifExample();
		//it.ifElseExample();
		//it.ifElseIfElseExample();
		//it.enhancedIf();
		it.verifyEvenOdd(10);
		
	}

}
