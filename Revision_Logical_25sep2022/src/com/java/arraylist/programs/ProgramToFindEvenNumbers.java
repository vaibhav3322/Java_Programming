package com.java.arraylist.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramToFindEvenNumbers 
{
   public static void main(String[] args) {
	
	   List<Integer> list=new ArrayList<>();
	                 list.add(13);
	                 list.add(50);
	                 list.add(20);
	                 list.add(49);
	                 list.add(99);
	                 System.out.println("Before Sort :"+list);
	                 Collections.sort(list);
	                 System.out.println("After Sort :"+list);
	           
	                 System.out.println("Print even numbers : ");
	                 list.stream().filter(s-> s%2==0).forEach(System.out::println);
}
   
}
