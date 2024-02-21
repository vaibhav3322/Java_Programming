package com.Iist.arraylist;

import java.util.ArrayList;

public class Add_Delete 
{
   public static void main(String[] args) {
	
	   int n = 10;
	   
	   ArrayList<Integer> al = new ArrayList<Integer>(10);
	   System.out.print("Elements of Arraylist :");      
	   for(int i=1; i<=n; i++)
	   {
		   al.add(i);
		   
	   }
	   System.out.print( al +" ");
	   
	   al.remove(5);
	   System.out.println();
	   System.out.print("Arralist after deletion : "+al);
	   
	   System.out.println();
	   // Iterating after deletion
	   System.out.print("Iterating after deletion :"  + " ");
	   for (Integer integer : al)
	   {
		  System.out.print(integer + " ");
	    }
}
}
