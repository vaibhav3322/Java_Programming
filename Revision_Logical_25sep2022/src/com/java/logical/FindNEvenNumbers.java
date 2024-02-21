package com.java.logical;

// find first n even numbers
public class FindNEvenNumbers 
{
   public static void main(String[] args) {
	
	   int num=50;
	   
	   for(int i=1;i<=num;i++)
	   {
		   if(i%2==0) // for odd numbers simply i%2!=0
		   {
			   System.out.print( i + " ");
		   }
	   }
}
}
// int num =10;
// for(int i=1;i<=num;i++)
//{
//	if(num % 2 !=0)
//{}
//}