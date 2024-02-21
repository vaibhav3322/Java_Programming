package Logical_Programs;

import java.util.Scanner;

public class AlphabetOrNot
{
     public static void main(String[] args)
     {
		  Scanner sc=new Scanner(System.in);
		     System.out.println("Enter the Character");
		     
		     char ch=sc.next().charAt(0);
		     
		     if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		     {
		    	 System.out.println("Entered Character "+ch+ " is An Alphabet " );
		     }
		     else
		     {
		    	 System.out.println("Not An alphabet");
		     }
	   }
}
