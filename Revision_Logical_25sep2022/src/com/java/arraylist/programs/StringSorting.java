package com.java.arraylist.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorting 
{
   public static void main(String[] args) {
	
	   List<String> city=new ArrayList<String>();
	                city.add("Pune");
	                city.add("Patna");
	                city.add("Patiyala");
	                city.add("Akola");
	                city.add("Ahmednagar");
	                
	                System.out.println("Befor Sorting :"+city);
	                
	                // collection sort() method is used to sort by alphabetic or natural order
	                Collections.sort(city);
	                System.out.println("After Sorting :"+city);
	                
	                
}
}
