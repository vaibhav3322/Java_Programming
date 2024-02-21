package com.java.arraylist.programs;

import java.util.ArrayList;
import java.util.List;

public class ReverseUsingArrayList
{
    public static void main(String[] args) {
		
    	String s1="maximum";
    	String next="";
    	int sLength=s1.length()-1;
    	
    	for(int i=0; i<=sLength; i++)
    	{
    		char ch=s1.charAt(i);
    		
    		next = ch+next;
    	}
    	System.out.println(next);
	}
}
