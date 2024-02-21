package com.practice.july2023;

public class FindAndCountNOddNumbers 
{
    public static void main(String[] args) {
		
    	int num= 20;
    	int count =0;
    	System.out.println("First 20 Odd Numbers are ");
    	for(int i=1 ; i<=20 ;i++)
    	{
    		if(i % 2 !=0)
    		{
    			System.out.print(i +" ");
    			count++;
    		}
    	}
    	System.out.println();
    	if(count>0)
    	{
    		System.out.println("Count Of Odd Numbers are : "+count);
    	}
	}
}
