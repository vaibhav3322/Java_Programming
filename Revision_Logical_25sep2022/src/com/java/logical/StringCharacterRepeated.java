package com.java.logical;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StringCharacterRepeated 
{
	public static void main(String args[])   
	{  
	String str= "Communication";  
//	
//	Map<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase).
//	collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()));  
//	
//	System.out.println(result);  
	Map<String , Long> res=Arrays.stream(str.split("")).map(String::toLowerCase)
			.collect(Collectors.groupingBy(s -> s,TreeMap::new ,Collectors.counting()));
	
	System.out.println(res);
	
	
	
	
	}  
}

//class Main
//{
//	public static void main(String[] args) {
//		
//		String s1="Geeta";
//		Map<String,Long> map=Arrays.stream(s1.split("")).map(String::toLowerCase).
//				collect(Collectors.groupingBy(s-> s, LinkedHashMap::new , Collectors.counting()));
//		System.out.println(map);
//	}
//}