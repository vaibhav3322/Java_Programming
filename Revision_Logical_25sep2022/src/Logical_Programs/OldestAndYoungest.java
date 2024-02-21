package Logical_Programs;

import java.util.Scanner;

public class OldestAndYoungest
{
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Age Of A :");//60=oldest//60=oldest
	      int A=sc.nextInt();
	      
	      System.out.println("Enter Age Of B  :");//50//40=youngest
	      int B=sc.nextInt();
	      
	      System.out.println("Enter Age Of C :");//40=youngest//50
	      int C=sc.nextInt();
	      
	      if(A>B && A>C)
	      {
	    	  if(B>C)
	    	  {
	    		  System.out.println("A is Oldest & C is Youngest");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("A is Oldest & B is Youngest");
	    	  }
	      }
	      
	      if(B>A && B>C)
	      {
	    	  if(A>C)
	    	  {
	    		  System.out.println("B is Oldest & C is Youngest");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("B is Oldest & A is Youngest");
	    	  }
	      }
	      
	      if(C>A && C>B)
	      {
	    	  if(A>B)
	    	  {
	    		  System.out.println("C is Oldest & B is Youngest");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("C is Oldest & A is Youngest");
	    	  }
	      }
    }
}
