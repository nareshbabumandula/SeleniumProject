package com.java.basics;

import com.locators.BrowserTest;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		
		// Auto boxing
		int i=10; // Primitive variable
		Integer in=i; // Assigning the primitive variable i to the wrapper class reference variable in
		System.out.println(i+ "  " +in);
		
		Integer inte = new Integer(20);
		int x = inte.intValue(); // Assigning the object reference variable 'inte' to the primitive variable x
		System.out.println(inte + " " + x);
		
		int a = inte; // Assigning the wrapper class reference variable to the respective primitive variable
		System.out.println(a + " " + inte);
		
		//Converting a primitive data type to String data type
		int b=100;
		String data = Integer.toString(b);
		System.out.println(b + " " + data);
		System.out.println(((Object)b).getClass().getSimpleName());
		System.out.println(data.getClass().getSimpleName());
		
		BrowserTest bt = new BrowserTest();
		System.out.println(bt.getClass().getSimpleName());
		
		// Converting String to an Ingeter type
		String sText = "100";
		int c = Integer.parseInt(sText);
		System.out.println(sText.getClass().getSimpleName());
		System.out.println(((Object)c).getClass().getSimpleName());
		
		
		
		
		

	}

}
