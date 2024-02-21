package com.java.logical;

import java.util.Scanner;

public class PalindromeNumber 
{
    public static void main(String[] args) 
    {
		  Scanner sc=new Scanner(System.in);
		     System.out.println("Enter number");
		     int num = sc.nextInt();//121
		     
		     int org_no=num;
		     int rem, palin=0;
		     
		     while(num > 0)
		     { 
		    	 rem = num % 10;
		    	 palin=palin *10 + rem ;
		    	 num = num / 10 ;
		     }
		     
		     System.out.println(palin);
		     
		     if(org_no == palin)
		     {
		    	 System.out.println(org_no + " is a palindrome");
		     }
		     else
		     {
		    	 System.out.println(org_no + " is not palindrome");
		     }
	   }
}
