package com.java.basics;

public class StringBufferVsBuilder {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		
		for (int i = 0; i < 10000; i++) {
			sb.append("Training");
		}
		
		System.out.println("Time taken by StringBuffer to append the String is : " + (System.currentTimeMillis()-startTime));
		
		
		long startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Java");
		
		for (int i = 0; i < 10000; i++) {
			sb.append("Training");
		}
		
		System.out.println("Time taken by StringBuilder to append the String is : " + (System.currentTimeMillis()-startTime1));
		

	}

}
