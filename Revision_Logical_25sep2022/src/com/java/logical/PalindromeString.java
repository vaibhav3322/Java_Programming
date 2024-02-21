package com.java.logical;

import java.util.Scanner;

public class PalindromeString 
{
   public static void main(String[] args) {
	
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter The String");
	     String s1=sc.next();
	     
	     String org_string=s1;
	     int length=s1.length()-1; String next = "";
	     char ch;
	     
	     for(int i=length ; i>=0 ; i--)
	     {
	    	 ch = s1.charAt(i);
	    	 next = next + ch ;
	    	 
	     }
	     
	     System.out.println(next);
	     
	     if(org_string.equals(next))
	     {
	    	 System.out.println(org_string + " String is palindrome");
	     }
	     else
	     {
	    	 System.out.println(org_string + " String is not palindrome");
	     }
}
   
}
