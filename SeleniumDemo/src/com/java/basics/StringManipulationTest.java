package com.java.basics;

public class StringManipulationTest {
	
	// User defined method - StringMethods
	public void StringMethods() {
		
		String sText1 = "hello world";
		String sText2 = "WELCOME";
		String sText3 = "core java";
				
		System.out.println(sText1.length());
		System.out.println(sText1.toUpperCase());
		System.out.println(sText2.toLowerCase());
		System.out.println(sText1.charAt(0));
		System.out.println(sText3.contains("java"));
			
	}

	public static void main(String[] args) {
		
		StringManipulationTest sm = new StringManipulationTest();
		sm.StringMethods();
		

	}

}
