package com.Iist.arraylist;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class CreateArrayList
{
  public static void main(String[] args) 
  {
	  ArrayList<String> list = new ArrayList<>();
	                    list.add("abc");
	                    list.add("abc");
	                    list.add("def");
	                    list.add("ghi");
	                    list.add("jkl");
	                    
	                    System.out.println("Arraylist after adding element :" +list);
	                    
	    // Iterating using for each loop
	                    System.out.println("Arraylist using foreach loop");
	                    for (String names : list) 
	                    {
						   System.out.print(names);
						   System.out.print(" , ");
						}
	                    
	                    Set<String> set=new LinkedHashSet<String>(list);
	                    System.out.println(set);
    }
}
