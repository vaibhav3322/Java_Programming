package com.java.exceptionScenarion;

public class Test
{
   int a=20;
   
   public static void main(String[] args) {
	
	   try {
		   int b=20/0;
		   String s=null;
		   System.out.println(s);
		   System.out.println(b);
		  
	   
	       } 
	   catch (ArithmeticException e) 
	   {
		// TODO: handle exception
		System.out.println("Exception Handled ");
	   }
	   catch (Exception e) 
	   {
			// TODO: handle exception
			System.out.println("Parent Exception Handled ");
		}
}
}
