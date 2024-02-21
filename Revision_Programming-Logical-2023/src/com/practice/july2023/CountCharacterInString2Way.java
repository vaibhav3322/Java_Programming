package com.practice.july2023;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountCharacterInString2Way
{
    public static void main(String[] args) {
		
    	String str="aabbccddefgh";
    	
    	Map<String, Long> result=Arrays.stream(str.split(""))
    			.collect(Collectors.groupingBy(s->s,TreeMap::new ,Collectors.counting()));
    	
    	System.out.println("Character Occourance in the String -->> "+str+ " : ");
    	System.out.println(result);
	}
}
