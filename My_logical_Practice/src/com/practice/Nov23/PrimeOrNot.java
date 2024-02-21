package com.practice.Nov23;

import java.util.Scanner;

public class PrimeOrNot
{
    public static void main(String[] args) {
		
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Number here :");
    	int num = sc.nextInt(); int count=0;
    	
    	for(int i=1; i<=num ; i++)
    	{
    		if(num % i == 0)
    		{
    		   count++;
    		}
    	}
    	
    	if(count == 2)
    	{
    		System.out.println(num + " is a Prime number ");
    	}
    	else
    	{
    		System.out.println(num + " is not a Prime number ");
    	}
	}
}
