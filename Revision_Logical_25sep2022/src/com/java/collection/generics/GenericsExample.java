package com.java.collection.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample
{
  public static void main(String[] args) {
	
	  //without generics
	  
//	  List l=new ArrayList();
//	       l.add(1);
//	       l.add("add");
//	       
//	       System.out.println(l);
//	       
//	       // type casting before generics
//	       String s=(String) l.get(0); // type casting we have provided.
//	       System.out.println(s);
	       
	       //with generics
	       
	       List<Integer> lis=new ArrayList<Integer>();
	                     lis.add(1);
	                     lis.add(1);
	                     lis.add(1);
	                    // lis.add("Sasti");
	                     int i=lis.size();// we need not to provide type casting for integer data type
	                     System.out.println("Size of Arraylist :"+i);
	                     System.out.println(lis);
	                    
	                     
}
}
