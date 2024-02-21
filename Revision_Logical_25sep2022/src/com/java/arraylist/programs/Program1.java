package com.java.arraylist.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Program1 
{
	public static void main(String[] args) {
		
		   List<Integer> list=new ArrayList<Integer>();
                 list.add(1);
                 list.add(1);
                 list.add(1);
                 list.add(1);
                 list.add(1);
                 list.add(1);
                 
               //  1.using forEach() Method
               //  list.forEach(System.out::println);
                 //2.using Advance for loop
//                 System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
//                 for(int num : list)
//                 {
//                	 System.out.println(num);
//                 }
                 //3.Using Iterator
//                 Iterator itr=list.iterator();
//                 System.out.println("Using Iterator :");
//                 while(itr.hasNext())
//                 {
//                	 
//                	 System.out.println(itr.next());
//                 }
                 Set<Integer> s=new LinkedHashSet<>();
                        s.addAll(list);
                        System.out.println(s);
	}
}
