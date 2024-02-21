package Logical_programming.src.Fibonacci_series;

import java.util.Scanner;

public class program1
{
   public static void main(String[] args) {
	
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("please enter the input till which we want print fibonnanci");
	   
	   int input=sc.nextInt();
	   
	   int previous=0,next=1,result=0;
	   
	   for(int i=0;i<=input;i++)
	   {
		   System.out.println(previous+ " ");
		   
		   result=previous+next;
		   
		   previous=next;
		   
		   next=result;
		   
	   }
	   
			   
}
}
