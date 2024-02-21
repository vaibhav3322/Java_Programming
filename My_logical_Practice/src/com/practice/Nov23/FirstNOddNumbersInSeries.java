package com.practice.Nov23;

import java.util.Scanner;

public class FirstNOddNumbersInSeries
{
   public static void main(String[] args) {
	
	   Scanner sc=new Scanner(System.in);
  	   System.out.println("Enter the Number till you want odd num series ");
  	   int number=sc.nextInt();
  	   int count=0;
  	   System.out.println("Odd Number series upto "+ number + " is : ");
  	   for(int i= 1; i<=number ; i++)
  	   {
  		   if(i % 2 != 0)
  		   {
  			   System.out.print(i +" ");
  			   count++;
  		   }
  	   }
  	   System.out.println();
  	   if(count>0)
  	   {
  		   System.out.println("Count Of Odd numbers in a given series is : "+count);
  	   }
	}
}

