package com.java.arraylist.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Programs3
{
  public static void main(String[] args) {
	
	  List<String> proLanguage=new ArrayList<String>();
	               proLanguage.add("C");
	               proLanguage.add("C++");
	               proLanguage.add("Java");
	               
	               // iterate using for loop
	               
	               for(int i=0; i<proLanguage.size();i++)
	               {
	            	   System.out.println("...");
	            	   System.out.println(proLanguage.get(i));
	               }
	               
//	               //Iterate Using Advance For loop
//	               
//	               for(String s: proLanguage)
//	               {
//	            	   System.out.println(s);
//	               }
//	               // Iterate Using forEach() method
//	               
//	               proLanguage.forEach(s-> System.out.print(s+" "));
	               
	               // Iterate Using ListIterator() 
	               
//	               ListIterator<String> itr=proLanguage.listIterator(proLanguage.size());
//	               while(itr.hasPrevious())
//	               {
//	            	   System.out.println(itr.previous());
//	               }
//	               
////	               // removeIf() method
	           proLanguage.removeIf(s -> s.startsWith("C"));
	           System.out.println("After removing langu which starts with "+" C "+ " Letter " +proLanguage);
	           
	           List<String> newProgramming=new ArrayList<String>(proLanguage);
	                        newProgramming.add("Rubby");
	                        newProgramming.add("Pearl");
	                        newProgramming.add("Javascript");
	                        
	                        System.out.println(newProgramming);
//	                        
//	                        // clear()
	                        newProgramming.clear();
	                        System.out.println("Remove all list element :"+newProgramming);
	                                     
	           
	           
	               
}
}
