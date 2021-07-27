package basics;

public class DataTypes {

	public static void main(String[] args) {
		
		/*
		 * Java language is a case senstitive and high level language Primitive
		 * datatypes byte -> short -> int -> long -> float -> double -> char -> boolean
		 * Memory allocation for the primitive data types if fixed irrespective of the
		 * operating system
		 * Dynamic Programming Language : If any programming language allows memory allocation for the
		 * primitive data types at RUNTIME then that programming language is called as Dynamic language
		 * Type checking happens at compile time, Java is statically-typed, so it expects its variables to be declared before they can be assigned
		 * values.
		 */
		
		/* Steps to Run the Java application 
		 * 1. Click on Run button in toolbar
		 * 2. Right Click on Code editor -> Run As -> Java Application
		 * 3. Right Click on File name.java -> Run As -> Java Application
		 * 4. Press Ctrl + F11
		 * */
				
		byte a=112; // 1 byte = 8 bits
		short b=4544; // 2 bytes = 16 bits
		int c=23425; // 4 bytes
		long d = 2453456; // 8 bytes
		float e = 24.4f; // 4 bytes
		double f = 2345.45756; // 8 bytes
		char g = 'j'; // 2 bytes
		boolean h = true; // 1 bit
		
		System.out.println("Min value of byte is : " + Byte.MIN_VALUE);
		System.out.println("Max value of byte is : " + Byte.MAX_VALUE);
		System.out.println("Min value of short is : " + Short.MIN_VALUE);
		System.out.println("Max value of short is : " + Short.MAX_VALUE);
		System.out.println("Min value of integer is : " + Integer.MIN_VALUE);
		System.out.println("Max value of integer is : " + Integer.MAX_VALUE);
					
		//sysout + ctrl + spacebar
		System.out.println("Byte value of a is : " + a);
		System.out.println("Short value of b is : " + b);
		System.out.println("Int value of c is : " + c);
		System.out.println("Long value of d is : " + d);
		System.out.println("Float value of e is : " + e);
		System.out.println("Double value of f is : " + f);
		System.out.println("Char value of g is : " + g);
		System.out.println("Boolean value of h is : " + h);
				
		/*
		 * Lexeme : Smallest logical unit in java programming is called as "Lexeme"
		 * Token : The collection of lexemes come under a particular group is called as "Token"
		 * int a=b+c*d;
		 * Lexemes : int,a,=,b,+,c,*,d,;
		 * 
		 * Tokens:
		 * 
		 * 1. Data Types
		 * 2. Identifiers
		 * 3. Operators
		 * 4. Special Symbols
		 */
		

	}

}
