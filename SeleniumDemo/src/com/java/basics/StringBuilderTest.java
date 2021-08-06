package com.java.basics;

public class StringBuilderTest {
	
	/*
	 * StringBuffer is synchronized(thread-safe) while String Builder is not thread safe
	 * StringBuffer is less efficient than StringBuilder
	 */

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("Before : " + sb.hashCode());
		sb.append(" ");
		sb.append("world");
		System.out.println("After : " + sb.hashCode());
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		
	}

}
