package Throw_keyword_Use;

import java.util.Scanner;

public class Famous 
{
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the rollno");
	   int roll=sc.nextInt();
	   
	   try 
	   {
		  if(roll<0)
		  {
			  throw new ArithmeticException("number entered is not positive");
		  }
		  else
		  {
			  System.out.println("rollno is valid");
		  }
	       } 
	   catch (Exception e) 
	   {
		   System.out.println("exception is thrown");
		   System.out.println(e.getMessage());
	   }
   }
}
