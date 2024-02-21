package com.java.logical;

import java.util.Scanner;

//num = 1234
// reverse = 4321
public class ReverseNumber 
{
    public static void main(String[] args) 
    {
		  Scanner  sc=new Scanner(System.in);
		  System.out.println("Enter Number");
		  int num=sc.nextInt();
		  
		  int rem, rev=0;
		  
		    while(num != 0)
		    {
		    	rem = num % 10; // 1234%10=4 // 123%10 = 3 // 12%10 =2 // 1%10=1
		    	rev = rev *10 + rem ; // 4 // 4*10+3=43 // 43*10+2=432 // 432*10+1=4321
		    	num = num / 10; // 1234/10 = 123 // 123/10=12 // 12/10=1
		    }
		    System.out.println("Reverse Number :" +rev);
	  }
}
