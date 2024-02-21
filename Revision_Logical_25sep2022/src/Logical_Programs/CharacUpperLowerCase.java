package Logical_Programs;

import java.util.Scanner;

public class CharacUpperLowerCase
{
    public static void main(String[] args)
    {
	    Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the character here");
	      char ch=sc.next().charAt(0);
	      
	      if (ch>='A' && ch<='Z') 
	      {
			  System.out.println( "Entered UpperCase Character : "+ch);
		  }
	      else if (ch>='a' && ch<='z') 
	      {
	    	  System.out.println("Entered LowerCase Character : "+ch);
		    }
	  }
}
