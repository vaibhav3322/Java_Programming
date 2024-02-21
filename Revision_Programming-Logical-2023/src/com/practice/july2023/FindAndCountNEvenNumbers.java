package com.practice.july2023;

public class FindAndCountNEvenNumbers
{
    public static void main(String[] args) {
		
    	int num =50;
    	int count =0;
    	
    	System.out.println("Even Numbers upto 50 are : ");
    	for(int i=1 ; i<=num ; i++)
    	{
    		if(i%2 == 0)
    		{
    			System.out.print(i + " ");
    			count++;
    		}
    		
    	}
    	System.out.println();
    	if(count>0)
    	{
    		System.out.println("Count Of Even Numbers is : " +count);
    	}
	}
}
