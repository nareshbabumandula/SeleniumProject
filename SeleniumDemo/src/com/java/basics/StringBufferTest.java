package com.java.basics;

public class StringBufferTest {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hello");
		System.out.println("Before : " + sb.hashCode());
		sb.append("world");
		System.out.println("After : " + sb.hashCode());
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		StringBuffer sb1 = new StringBuffer("123");
		System.out.println(sb1.reverse());
	}

}
