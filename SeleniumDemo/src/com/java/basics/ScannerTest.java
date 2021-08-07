package com.java.basics;

import java.util.Scanner;

public class ScannerTest {

	
	public void scannerExample() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
	
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		
		if (a<b) {
			System.out.println("a is less than b");
		}else if(a==b) {
			System.out.println("a is equal to b");
		}else {
			System.out.println("a is greater than b");
		}
	}
	
	

	public static void main(String[] args) {
		ScannerTest st = new ScannerTest();
		st.scannerExample();
	
	}

}
