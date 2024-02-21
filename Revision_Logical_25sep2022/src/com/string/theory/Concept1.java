package com.string.theory;

//How many objects are created in following scenario
// answer is 3
public class Concept1 
{
    public static void main(String[] args)
    {
	    // creating string using literals
    	
    	String s1="java"; // s1 & s2 both stored in scp part of heap mempry
    	String s2="java";  // 
    	System.out.println("Equals Checking : "+s1.equals(s2));
    	 
    	System.out.println(s1 == s2); // true because s1&s2 both will point out same memory area
    	//creating string objects using new keyword
    	
    	String s3=new String("java"); // s3 created with new keyword so s3 will store in Heap
    	String s4=new String("java"); // since s4 also created with new keyword so s4 will store in Heap
	   
    	System.out.println("Equals Checking : "+s1.equals(s3));
    	
    	System.out.println(s3 == s4);// false because s3 & s4 point out different object.
    	System.out.println(s1 == s3);//false
    	
    	
    	
    	//System.out.println(s4.equals(s3));
    }    
}
