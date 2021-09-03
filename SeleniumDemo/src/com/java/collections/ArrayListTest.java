package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	
	public void arrayListExample() {
		
		ArrayList<String> list = new ArrayList<String>();

		List li = new ArrayList();

		list.add("Naresh");
		list.add("Rajesh");
		list.add("Gunjan");
		list.add("Riya");
		list.add("Manideep");
		list.add("Ruken");
		list.add("Ramesh");
		list.add("Manohar");
		list.add("Shilpa");
		list.add("Naresh");

		//list.add(null);
		//list.add("");
				
		System.out.println("No of elements are : " + list.size());	
		System.out.println(list.get(0));
		list.remove(1);
	
		list.add("Rajesh Sharma");
		list.add("Ajay");
		list.add(0, "Shilpa");
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Kiran");
		list1.add("Anjali");
		list1.add("Ramesh");
		
		System.out.println(list.isEmpty());
		//System.out.println(list.removeAll(list));
		System.out.println(list.lastIndexOf(list));
		System.out.println(list.addAll(list1));
	
		System.out.println(list);
		
		System.out.println("List elements are : " + list);
		System.out.println("List1 elements are : " + list1);
		// Apply retainAll method
		list1.retainAll(list);
		System.out.println("After applying retail all method");
		System.out.println("List elements are : " + list);
		System.out.println("List1 elements are : " + list1);
		
			
		System.out.println("Iteration Starts.....");
		// Iterate and traverse through Iterator
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Iterate through collection using lambda
		System.out.println("Iterating through collection using lambda");
		list.forEach((n)->System.out.println(n));
		
		/* Lambda expression consists of 3 components 
		 * 1. Argument list - It can be empty or non empty
		 * 2. Arrow Token: -> - It is used to link the arguments list and the body or code
		 * 3. Body- It contains expression and logical statements for the lamnda expression
		 * 
		 * Lambda expression types:
		 * 1. No parameter syntax : ()->{Body}
		 * 2. One parameter syntax : (p)->{Body}
		 * 3. Two parameters syntax : (p1, p2)->{Body}
		 * */
		
		list
	    .stream()
	    .filter(s -> s.startsWith("R"))
	    .map(String::toUpperCase)
	    .sorted()
	    .forEach(System.out::println);
			
	}
	
	

	public static void main(String[] args) {
		ArrayListTest alt = new ArrayListTest();
		alt.arrayListExample();
		
	}

}
