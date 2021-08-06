package com.control.statements;

import java.util.Scanner;

public class IfTest {
	
	int a = 100;
	int b = 100;
	
	
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
	
	

	public static void main(String[] args) {
		IfTest it = new IfTest();
		//it.ifExample();
		//it.ifElseExample();
		it.ifElseIfElseExample();
		
	}

}
