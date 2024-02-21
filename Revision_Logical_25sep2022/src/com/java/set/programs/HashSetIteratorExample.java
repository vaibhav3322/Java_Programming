package com.java.set.programs;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetIteratorExample {
    public static void main(String args[]) {
        
    // Declaring a HashSet
    //	  Set<String> hashset = new HashSet<String>();
    	Set<String> hashset = new TreeSet<String>();
   // Set<String> hashset = new LinkedHashSet<String>();
    // Add elements to HashSet
    hashset.add("Pear");
    hashset.add("Apple");
    hashset.add("Orange");
    hashset.add("Papaya");
    hashset.add("Banana");  
    
    
    System.out.println("HashSet Size");
    System.out.println(hashset.size());
    // Get iterator
    Iterator<String> it = hashset.iterator();
    // Show HashSet elements
    System.out.println("HashSet contains: ");
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
