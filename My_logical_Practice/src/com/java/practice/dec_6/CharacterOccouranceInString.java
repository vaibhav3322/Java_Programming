package com.java.practice.dec_6;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class CharacterOccouranceInString 
{
   public static void main(String[] args) {
	
	   String c="AaaABBbbCccDefG";
	   
	   Map<String,Long> result=Arrays.stream(c.split(""))
			   .collect(Collectors.groupingBy(s -> s, TreeMap::new ,Collectors.counting()));
	   
	   System.out.println("Character Occorances In The String Are : ");
	   System.out.println(result);
	   
	   Map<Object, Long> map =Arrays.stream(c.split("")).collect(Collectors.groupingBy(s -> s, TreeMap::new ,Collectors.counting()));
	   
}
}