package com.java.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Testing {
	
	public static void main(String[] args) {
		
		 List<Integer> list1 =Arrays.asList(2,3,5,7,15,19,9,25,11);
		 
		List<Integer> li= list1.stream().filter(n -> n > 5).collect(Collectors.toList());
		
		Collections.sort(li);
		 
		 System.out.println(li);
		 
		
	}

}
