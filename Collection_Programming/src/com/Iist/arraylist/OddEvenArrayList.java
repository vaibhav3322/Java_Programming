package com.Iist.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddEvenArrayList 
{
   public static void main(String[] args) {
	
	   
	   List<Integer > al=Arrays.asList(12,13,14,15,16);
	       System.out.println("List Having Even Numbers :");
	       for(Integer i: al)
	       {
	    	   if(i%2==0)
	    	   {
	    	       System.out.print(i+" ");
	    	   }
	       }
	                  
}
}
