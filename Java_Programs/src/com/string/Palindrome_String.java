package com.string;

import java.util.Scanner;

public class Palindrome_String
{
  public static void main(String[] args) 
  {
	  String s1,s2 = "";
	  System.out.println("Enter the string");
     Scanner sc=new Scanner(System.in);
     
     
      s1=sc.nextLine();
     
     int n=s1.length();
     
     for(int i=n-1;i>=0;i--)
     {
    	  s2 = s2 +s1.charAt(i);
     }
     
     if(s1.equals(s2))
     {
    	 System.out.println("String is Palinndrome : ");
     }
     else
     {
    	 System.out.println("String is not Palindrome");
     }
 }
}
