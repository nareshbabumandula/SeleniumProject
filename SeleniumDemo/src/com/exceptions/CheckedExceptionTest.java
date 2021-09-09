package com.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionTest {


	public void checkedExceptionwithThrows() throws IOException {

		FileReader fr = new FileReader("./files/Data.txt"); // Compile time exception

		int i;

		while ((i=fr.read())!=-1) {
			System.out.println((char)i);
		}
		fr.close();
	}

	public void checkedExceptionwithTryCatchFinally() {

		try {
			FileReader fr = new FileReader("./files/Data.txt"); // Compile time exception
			int i;
			while ((i=fr.read())!=-1) {
				System.out.println((char)i);
			}
			fr.close();
		}catch (IOException e) {
			System.out.println("Catch block started..!");
			e.printStackTrace();
			System.out.println("Catch block ended..!");
		} 
		finally {
			System.out.println("Executing finally block..!");
		}

		
		System.out.println("Continue execution");
	}

	public void checkedExceptionwithMutipleCatchBlocks() {

		try {
			FileReader fr = new FileReader("./files/Data123.txt"); // Compile time exception
			int i;
			while ((i=fr.read())!=-1) {
				System.out.println((char)i);
			}
			fr.close();
		}catch (IOException e) {
			System.out.println("Catch block started..!");
			e.printStackTrace();
			System.out.println("Catch block ended..!");
		}catch (Exception e) {
			System.out.println("This is the catch block for the Exceptionc class");
		}

		System.out.println("Continue execution");

	}


	public static void main(String[] args) throws IOException  {

		CheckedExceptionTest cet = new CheckedExceptionTest();
		//cet.checkedExceptionwithThrows();
		cet.checkedExceptionwithTryCatchFinally();
		//cet.checkedExceptionwithMutipleCatchBlocks();
		

	}

}
