package com.practice.Nov23;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountCharacterOccouranceInString 
{
  public static void main(String[] args) {
	
	  String str="AaaBbbCcDef";
	  
     Map<String,Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s , TreeMap::new , Collectors.counting()));
     
     System.out.println("Character Occourance in " + str +" is");
     System.out.println(map);
     
     System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
     Map<String, Long> map1=Arrays.stream(str.split("")).
    		 collect(Collectors.groupingBy(s -> s , TreeMap::new , Collectors.counting()));
     
     System.out.println(map1);
}
}
