package com.java.logical;

import java.util.Scanner;

public class EvenOrOdd 
{
   public static void main(String[] args) {
	
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the Number");
	   int num = sc.nextInt();
	   
	   if(num % 2 == 0)
	   {
		   System.out.println(num+" Is Even Number");
	   }
	   else
	   {
		   System.out.println(num+ " Is Odd Number ");
	   }
}
}
