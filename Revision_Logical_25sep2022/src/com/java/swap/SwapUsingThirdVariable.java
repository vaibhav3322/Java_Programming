package com.java.swap;

public class SwapUsingThirdVariable
{
  public static void main(String[] args) {
	
	  
	      int x=10; int y=20;
	      int z;
	      
	      System.out.println("Before Swap x :"+x);
	      System.out.println("Before Swap y :"+y);
	      
	      z=x;
	      x=y;
	      y=z;
	      
	      System.out.println("After Swap x :"+x);
	      System.out.println("After Swap y :"+y);
	      
}
}
