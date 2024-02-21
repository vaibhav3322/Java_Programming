package com.java.logical;

import java.util.Scanner;

public class StringReverse
{
   public static void main(String[] args) {
	
//	   Scanner sc=new Scanner(System.in);
//	     System.out.println("Enter The String");
//	     String s1=sc.next();
//	     
//	     int length=s1.length()-1; String next = "";
//	     char ch;
//	     for(int i=length ; i>=0 ; i--)
//	     {
//	    	 ch=s1.charAt(i);
//	    	 next=next + ch ;
//	     }
//	     
//	     System.out.println("Reverse of the String is :" +next);
	   
	   String s1="Vaibhav";
	   char ch; String next="";
	   for(int i=s1.length()-1; i>=0;i--)
	   {
		   ch=s1.charAt(i);
		   next=next+ch;
	   }
	   System.out.println(next);
}
}
