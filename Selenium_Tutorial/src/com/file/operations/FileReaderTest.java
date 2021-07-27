package com.file.operations;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException  {
		long startTime = System.currentTimeMillis();
		FileReader fr = new FileReader("./Files/InputFile.txt");
		int i;
		
		while((i=fr.read())!=-1) {
			System.out.println((char)i);
		}
		fr.close();
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by FileReader class is : "+ (endTime-startTime) + " ms");
	}

}
