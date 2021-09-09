package com.file.operations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("./Files/OutputFile.txt");
		fw.write("Hello world");
		fw.close();
	}

}
