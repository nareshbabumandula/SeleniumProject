package com.exceptions.demo;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionTest {

	public void checkedExceptionExample() throws IOException {
		System.out.println(System.getProperty("user.dir"));

		FileInputStream fis = new FileInputStream("./Files/Test Data.txt");
		int r;

		while((r=fis.read())!=-1) {
			System.out.print((char)r);
		}

		fis.close();

	}

	public static void main(String[] args) throws IOException {

		CheckedExceptionTest cet = new CheckedExceptionTest();
		cet.checkedExceptionExample();
	}

}
