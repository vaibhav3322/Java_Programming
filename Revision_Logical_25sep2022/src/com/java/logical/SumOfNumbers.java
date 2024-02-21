package com.java.logical;

import java.util.Scanner;

public class SumOfNumbers
{
   public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number till you want sum : ");
	  int num = sc.nextInt();
	  System.out.println("Sum of first "+num+ " numbers is :");
	   int sum=0;
	   for(int i=1; i<=num;i++)
	   {
		   sum = sum + i;
	   }
	   
	   System.out.println(sum);
}
}
