package com.exceptions;

public class UncheckedExceptionTest {

	private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

	void uncheckedExceptionExample1() {

		try {
			int a =10;
			int b = 0;
			int c = a/b; // Division by zero exception
			System.out.println("Division of a and b is : " + c);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void uncheckedExceptionExample2() {

		try {

			String sText = null;
			System.out.println(sText.length());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void uncheckedExceptionExample3() {

		try {

			String names[] = {"Swetha","Himaja","Shaan","Sandeep","Sheshu"};
			System.out.println(names[0]);
			System.out.println(names[1]);
			System.out.println(names[5]);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	void uncheckedExceptionExample4() {

		try {
			String sText = "Sheshu";
			int res = Integer.parseInt(sText);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	void uncheckedExceptionwithTryFinally() {
		try {
			System.out.println("Executing try block");
		}
		finally {
			System.out.println("This is finally block");
		}
	}
	
	void calSimpleInterest() {
		
		boolean bFlag = false;
		Exception exception = null;
				
		try {
			int P = 1000;
			int R = 10;
			int T = 2;
			int s = (P*R*T)/100; // Simple Interest
			System.out.println("Simple Interest is : " + s);
			bFlag = true;
		} catch (Exception e) {
			e.printStackTrace();
			exception = e;
		}finally {
			if (bFlag) {
				System.out.println("Successfully calculated the simple interest");
			} else {
				System.out.println("Failed to calculate simple interest since : " + exception);
			}
		}
		
		
	}

	public static void main(String[] args) throws ClassNotFoundException {
		UncheckedExceptionTest uce = new UncheckedExceptionTest();
		uce.uncheckedExceptionExample1();
		uce.uncheckedExceptionExample2();
		uce.uncheckedExceptionExample3();
		uce.uncheckedExceptionExample4();
		uce.calSimpleInterest();
		
		System.out.println("Loading MySQL JDBC driver");
        Class.forName(DRIVER_CLASS);
	
	}

}
