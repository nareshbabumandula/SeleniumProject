package com.java.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	
	//Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However, 
	// It is synchronized and contains many methods that are not the part of Collection framework.
	public void vectorExample() {
		
		Vector<String> vec = new Vector<String>();

		vec.add("Naresh");
		vec.add("Rajesh");
		vec.add("Nishanth");
		vec.add("Riya");
		vec.add("Himabindu");
		vec.add("Bala");
		vec.add("Ramesh");
		vec.add("Manohar");
		vec.add("Shilpa");
		vec.add("Naresh");
		vec.add(null);
		vec.add("");
		System.out.println("Capacity of the vector is  : " + vec.capacity());
		System.out.println("First element in vector is : " + vec.firstElement());
		System.out.println("Last element in vector is : " + vec.lastElement());
					
		System.out.println("No of elements are : " + vec.size());	
		System.out.println(vec.get(0));
		vec.remove(0);
		vec.add("Rajesh Sharma");
		System.out.println(vec);
		vec.add(0, "Ruken");
		System.out.println(vec);
		Vector<String> vec1 = new Vector<String>();
		vec1.add("Kiran");
		vec1.add("Anjali");
		
		System.out.println(vec.isEmpty());
		//System.out.println(vec.removeAll(vec));
		System.out.println(vec.lastIndexOf(vec));
		System.out.println(vec.addAll(vec1));
		System.out.println(vec);
			
		// Iterate and traverse through Iterator
		Iterator iter = vec.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//Lambda
		System.out.println("Iterating using Lambda");
		iter.forEachRemaining((e)->System.out.println(e));
			
	}
		

	public static void main(String[] args) {
		VectorTest alt = new VectorTest();
		alt.vectorExample();
		
	}

}
