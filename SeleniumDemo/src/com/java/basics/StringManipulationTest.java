package com.java.basics;

public class StringManipulationTest {
	
	// User defined method - StringMethods
	@SuppressWarnings("static-access")
	public void StringMethods() {
		
		String sText1 = "hello world";
		System.out.println("Before : " + sText1.hashCode());
		sText1 = "online training";
		System.out.println("After : " + sText1.hashCode());
		String sText2 = "WELCOME";
		String sText3 = "core java";
				
		System.out.println(sText1.length());
		System.out.println(sText1.toUpperCase());
		System.out.println(sText2.toLowerCase());
		System.out.println(sText1.charAt(0));
		System.out.println(sText3.contains("java"));
		System.out.println(sText1.concat(sText2).concat(sText3));
		System.out.println(sText2.toLowerCase() + " to " + sText3 + " " + sText1);
		System.out.println(sText3.indexOf('c'));
		System.out.println(sText2.compareTo("WELCOME"));
		System.out.println(sText1.startsWith("online"));
		System.out.println(sText1.endsWith("training"));
		System.out.println(sText2.lastIndexOf('E'));
		System.out.println(sText1.isEmpty());
		String sText4 = "";
		System.out.println(sText4.isEmpty());
		System.out.println(sText3.substring(0, 4));
		char[] charArr = sText2.toCharArray();
		for (char c : charArr) {
			System.out.println(c);
		}
		System.out.println(sText3.replace("java", "Java"));
		
		String strText = "View invoices edit or make payments add or change subscriptions"; // Space delimiter
		String[] arrResult = strText.split(" ");
		for (String word : arrResult) {
			System.out.println(word);
		}
		System.out.println(arrResult[0]);
		System.out.println(arrResult[2]);
		System.out.println(arrResult[3]);
		//System.out.println(arrResult[12]);
				
		System.out.println("No of elements in arrResult array are : " + arrResult.length);
		
		System.out.println(strText.join("|", arrResult));
		System.out.println(sText1.valueOf('h'));
			
	}

	public static void main(String[] args) {
		
		StringManipulationTest sm = new StringManipulationTest();
		sm.StringMethods();
		

	}

}
