package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
/**
 * The HashSet class extends AbstractSet class which implements Set interface. The Set interface inherits Collection 
 * and Iterable interfaces in hierarchical order.
 * Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class 
 * and implements Set interface.

	The important points about Java HashSet class are:
	
	HashSet stores the elements by using a mechanism called hashing.
	HashSet contains unique elements only.
	HashSet allows null value.
	HashSet class is non synchronized.
	HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
	HashSet is the best approach for search operations.
	The initial default capacity of HashSet is 16, and the load factor is 0.75.
	Difference between List and Set
	A list can contain duplicate elements whereas Set contains unique elements only.
 * @author admin
 *
 */
public class HashSetTest {
	
	public void hashsetExample() {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Rajesh");
		set.add("Riya");
		set.add("Himabindhu");
		set.add("Ramesh");
		set.add("Bala");
		set.add("Riya");
		set.add(null);
		set.add("");
		set.add("Ajit");
		
		set.remove("");
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		// Traverse through all the elements of hashset collection
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

	public static void main(String[] args) {
		HashSetTest hset = new HashSetTest();
		hset.hashsetExample();

	}

}
