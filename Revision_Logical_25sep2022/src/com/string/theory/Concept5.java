package com.string.theory;

// Difference Between "==" operator and "equals()" method
public class Concept5 
{
    public static void main(String[] args)
    { 
    	// s1 & s2 are 2 different objects
    	  String s2=new String("java");// s2 stored in Heap memory 
	    String s1="java";// s1 stored in scp area
	  
	    String s3=new String("Man");
	    System.out.println(s1 == s2);// false because "==" compares the refrence memory address. 
	    System.out.println(s1.equals(s2));// True because "equals()" compares the values of String. 
	    
	    System.out.println(s1.hashCode());
	    System.out.println(s2.hashCode());
	    System.out.println(s3.hashCode());
	}
}
