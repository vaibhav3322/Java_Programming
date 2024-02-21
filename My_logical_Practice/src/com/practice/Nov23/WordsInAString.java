package com.practice.Nov23;

public class WordsInAString 
{
   public static void main(String[] args) {
	
	   String s1="We are Indians";
	   int count=1;
	   
	   for(int i=0; i<s1.length();i++)
	   {
		   if((s1.charAt(i)==' ') && !(s1.charAt(i+1)==' '))
		   {
			   count++;
		   }
		   
	   }
	   System.out.println("Number of words in a string :" +count);
}
}
