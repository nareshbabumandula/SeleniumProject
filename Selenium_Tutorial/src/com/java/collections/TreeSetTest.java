package com.java.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public void TreeSetTestExample() {
		
		TreeSet<String> tset = new TreeSet<String>();
		
		SortedSet<String> sset = new TreeSet<String>();
		tset.add("Gunjan");
		tset.add("Ruken");
		tset.add("Manideep");
		tset.add("naresh");
		tset.add("Ruken");
	
		System.out.println(tset);
		//tset.clear();
		//System.out.println(tset);
		System.out.println(tset.contains("Manideep"));
		System.out.println(tset.ceiling("naresh"));
	    System.out.println(tset.last());
	    System.out.println(tset.first());
	    System.out.println(tset.pollFirst());
	    System.out.println(tset.pollLast());
	    
	    sset.add("Ravi");
	    sset.add("Kiran");
	    sset.add("Shravan");
	    sset.add("Teja");
	    sset.add("Ajit");
	    System.out.println(sset);

		
	}

	public static void main(String[] args) {
		TreeSetTest ts = new TreeSetTest();
		ts.TreeSetTestExample();
	}

}
