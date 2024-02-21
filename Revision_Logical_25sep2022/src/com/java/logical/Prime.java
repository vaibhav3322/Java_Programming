package com.java.logical;

import java.util.Scanner;

// prime number means divisible by 1 and itself.
// ex : 5 divisible by 1 and 5
public class Prime
{
   public static void main(String[] args)
   
   {
	   Scanner sc=new Scanner(System.in);
	     System.out.println("Enter The Number :");
	     int num=sc.nextInt();
	     int count=0;
	     for(int i=1 ; i<=num ; i++ )
	     {
	    	 if(num % i == 0)// 13 % 1= 0 (remainder)
	    	 {
	    		 count++;
	    	 }
	    	 
	     }
	    	 if(count == 2 )
	    	 {
	    		 System.out.println(num + " is Prime number");
	    	 }
	    	 else
	    	 {
	    		 System.out.println(num + " is not Prime Number");
	    	 }
	     
      }
}
