package com.java.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
/**
 * Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface. 
 * It inherits HashSet class and implements Set interface.

	The important points about Java LinkedHashSet class are:
	
	Java LinkedHashSet class contains unique elements only like HashSet.
	Java LinkedHashSet class provides all optional set operation and permits null elements.
	Java LinkedHashSet class is non synchronized.
	Java LinkedHashSet class maintains insertion order.
	Hierarchy of LinkedHashSet class
	The LinkedHashSet class extends HashSet class which implements Set interface. The Set interface inherits Collection and Iterable interfaces
	in hierarchical order.
 * @author admin
 *
 */
public class LinkedHashSetTest {
	
	public void hashsetExample() {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Rajesh");
		set.add("Riya");
		set.add("Himabindhu");
		set.add("Ramesh");
		set.add("Bala");
		set.add("Riya");
		set.add(null);
		set.add("ajit");
	
		
		// Traverse through all the elements of hashset collection
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

	public static void main(String[] args) {
		LinkedHashSetTest hset = new LinkedHashSetTest();
		hset.hashsetExample();

	}

}
