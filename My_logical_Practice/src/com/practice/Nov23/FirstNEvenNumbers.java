package com.practice.Nov23;

import java.util.Scanner;

public class FirstNEvenNumbers
{
    public static void main(String[] args) {
		
    	 Scanner sc=new Scanner(System.in);
  	   System.out.println("Enter the Number till you want even num series ");
  	   int num=sc.nextInt();
  	   int count=0;
  	   System.out.println("Even Number series upto "+ " 50 is : ");
  	   for(int i= 1; i<=num ; i++)
  	   {
  		   if(i % 2== 0)
  		   {
  			   System.out.print(i +" ");
  			   count++;
  		   }
  	   }
  	   System.out.println();
  	   if(count>0)
  	   {
  		   System.out.println("Count Of Even numbers in a given series is : "+count);
  	   }
	}
}
