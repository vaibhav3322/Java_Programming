package Logical_Programs;

import java.util.Scanner;

public class PrintAndCountVowels 
{
    public static void main(String[] args) 
    {
		 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter The String Here :");
    	String str=sc.next().toLowerCase();
    	
    	int count = 0;
    	System.out.println("String Contains Following Vowels :");
    	for(int i=0; i<str.length(); i++)
    	{
    		
    		if((str.charAt(i)=='a') || (str.charAt(i)=='e') || (str.charAt(i)=='i')
    				|| (str.charAt(i)=='o') || (str.charAt(i)=='u'))
    		{
    			count++;
    			
    			System.out.print(str.charAt(i) + " ");
    		}
    		
    		
    	}
    	System.out.println(" ");
    	System.out.println("String Has "+count+ " Vowels");
	  }
}
