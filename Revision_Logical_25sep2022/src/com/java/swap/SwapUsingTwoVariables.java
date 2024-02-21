package com.java.swap;

public class SwapUsingTwoVariables 
{
    public static void main(String[] args) 
    {
		 int m=50; int n=60;
		 
		 System.out.println("Before Swap m :"+m);
	      System.out.println("Before Swap n :"+n);
		 
		 m=m+n;//110
		 n=m-n;//110-60=50
		 m=m-n;//110-50=60
		 
		 
		 System.out.println("After Swap m :"+m);
	      System.out.println("After Swap n :"+n);
		 
	  }
}
