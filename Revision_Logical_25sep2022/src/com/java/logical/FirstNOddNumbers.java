package com.java.logical;

public class FirstNOddNumbers 
{
   public static void main(String[] args) {
	
	   int num=30;
	   System.out.println("First " + num+ " odd numbers :");
	   int count=0;
	   for(int i=0;i<=num;i++)
	   {
		   if(i%2!=0)
		   {
			   System.out.print(i+ " ");
			   count++;
		   }
	   }
	   System.out.println("");
	   if(count!= 0)
	   {
		   System.out.println("Count of odd numbers :"+count);
	   }
}
}
