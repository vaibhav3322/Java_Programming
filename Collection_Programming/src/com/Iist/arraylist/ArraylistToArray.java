package com.Iist.arraylist;

import java.util.ArrayList;

public class ArraylistToArray
{
    public static void main(String[] args) 
    {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		                   alist.add(1);
		                   alist.add(2);
		                   alist.add(3);
		                   alist.add(4);
		                   alist.add(5);
		                   
		    System.out.println("Arraylis : " +alist);
		    
		    // convert to array
		    
		    Integer[] array = new Integer[alist.size()];
		            alist.toArray(array);
		    System.out.println("Elements of an array");
		    for (Integer me : array) 
		    {
				System.out.print(me + " ");
			}
	  }
}
