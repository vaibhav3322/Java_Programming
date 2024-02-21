package com.java.list;


import java.util.Arrays;
import java.util.List;

public class SumOfelementsInArrayList 
{
   public static void main(String[] args) {
	
	   List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8,9);
	   int sum=0;
	   for(int i=0; i<=li.size();i++)
	   {
		   sum = sum + i;
	   }
	   
	   System.out.println(sum);
}
}
