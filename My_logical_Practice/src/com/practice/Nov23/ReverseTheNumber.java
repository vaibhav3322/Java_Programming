package com.practice.Nov23;

public class ReverseTheNumber
{
   public static void main(String[] args) {
	
	   int num=9876 , remainder, reverse=0;
	   
	    while(num != 0)
	    {
	    	remainder=num % 10 ;
	    	reverse=reverse * 10 + remainder;
	    	num = num / 10;
	    }
	    
	    System.out.println("Reverse of the number "+ "9876" +" = " +reverse);
}
}
