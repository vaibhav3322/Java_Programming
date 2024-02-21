package com.java.list;

import java.util.Arrays;
import java.util.List;

public class ArrayListDuplicatesString 
{
   public static void main(String[] args) {
	
	   List<String> lis=Arrays.asList("one","two","three","three","four","five","five","six");//size=8
	   System.out.println(lis);
	   System.out.println("");
	   
	   String[] arr = lis.toArray(new String[0]);
	   int count=0;
	   System.out.println("Duplicate String found :");
	 for(int i=0;i<arr.length;i++)
	  {
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[i]==arr[j])
			  {
				  System.out.println(arr[i] + " ");
				  count++;
			  }
		  }
	  }
	  System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	  System.out.println("Count of Duplicate String are :"+count);
}
}
