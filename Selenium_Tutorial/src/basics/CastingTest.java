package basics;

public class CastingTest {
	
	public static void main(String[] args) {
		
		/*
		 * Type Casting: The process of converting data from one data type to another
		 * data type is called as "Type Casting"
		 * 
		 * There are two types of Type castings are existed in Java
		 * 
		 * 1. Primitive data types Type Casting
		 * 2. User defined data types Type Casting
		 * 
		 * 1. Primitive data types Type Casting: The process of converting data from
		 * one primitive data type to another primitive data type is called as primitive
		 * date types type casting
		 * 
		 * i. Implicit Type Casting/Widening : The process of converting lower data type to higher
		 * date type is called as Implicit Type casting
		 * ii. Explicit Type Casting/Narrowing : The process of converting higher data type to lower
		 * date type is called as Explicit Type casting
		 */
		System.out.println("Implicit and explict on casting on primitive types examples..!");
		short s = 129;
		int i = s; // Widening
		System.out.println("Implicit casting : " + i);
		// Narrowing
		byte b = (byte) i;
		System.out.println(b);
		
	}

}
