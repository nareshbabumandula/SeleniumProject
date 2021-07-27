package com.exceptions.demo;

public class ThrowTest {
	
	public static void ThrowExample() {
		System.out.println("Throwing exception explicitly..!");
		throw new ArrayIndexOutOfBoundsException();
	}

	public static void main(String[] args) {
		try {
			ThrowExample();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Executing ArrayIndexOutOfBoundsException catch block..!");
			e.printStackTrace();
		}

	}

}
