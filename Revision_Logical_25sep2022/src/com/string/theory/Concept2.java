package com.string.theory;

//How many objects are created in following code snippet.
// In this case it will have 6 objects
public class Concept2
{
   public static void main(String[] args)
   {
	   //Object Creation Using String literals
	    String s1="code";
	    String s2="java";
	    
	    System.out.println(s1 == s2);//False because s1&s2 both will point out different scp memory
	                                  // so there are 2 objects
	    // Object Creation Using new 
	    String s3=new String("");
	    String s4=new String("man");
	    String s5=new String("man");
	    String s6=new String("java");
	    
	    System.out.println(s3 == s4);//false
	    System.out.println(s2 == s6);//false
	    System.out.println(s4 == s5);//false
	    
	    System.out.println("S3 String value :"+s3);
	    
     }
}
