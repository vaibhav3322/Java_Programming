package com.java.practice.dec_6;

import java.util.Scanner;

public class SpecialCharacterFromString 
{
   public static void main(String[] args) {
	
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Please Enter The String with Special character :");
	   String s1=sc.next();
	   int lengthOf_s1=s1.length()-1;
	    int count=0;
	   
	   String withNoSpecialCharacter="";
	   System.out.println("String With Special Characters : ");
	   for(int i=0;i<=lengthOf_s1; i++)
	   {
		   if( (!Character.isLetter(s1.charAt(i))) &&  (!Character.isDigit(s1.charAt(i))) && 
				   (!Character.isWhitespace(s1.charAt(i))) )
		   {
			   System.out.println(s1.charAt(i) + " ");
			   count++;
		   }
		   else
		   {
			   withNoSpecialCharacter=withNoSpecialCharacter+s1.charAt(i);
		   }
	   }
	   System.out.println("----------------------------------------------------------------------");
	   
	   
		   System.out.println("String Has Special Character " +count);
	   
	  
		   System.out.println("With No Special Character : "+withNoSpecialCharacter);
	   
}
}
