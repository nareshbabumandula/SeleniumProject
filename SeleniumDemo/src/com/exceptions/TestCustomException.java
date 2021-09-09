package com.exceptions;

class InvalidAgeException extends Exception{

	public InvalidAgeException(String errorMessage) {
		super(errorMessage);
	}
}


public class TestCustomException{
	
	
	void validateAge(int Age) throws InvalidAgeException{
		if (Age<18) {
			throw new InvalidAgeException("Age is not sufficient for applying for voter card");
		}else {
			System.out.println("You can apply for voter card");
		}
	}
	
	
	public static void main(String args[]) throws InvalidAgeException {
		TestCustomException tce = new TestCustomException();
		tce.validateAge(17);
	}
	
	
}