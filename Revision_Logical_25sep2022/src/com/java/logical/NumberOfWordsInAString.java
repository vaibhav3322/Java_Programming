package com.java.logical;

public class NumberOfWordsInAString 
{
   public static void main(String[] args) {
	
	   String s1="i am a fit boy";// 5 words and 4 whitespaces
	   
	   int count =1;
	   
	   for(int i=0;i<s1.length()-1;i++)
	   {
		   if((s1.charAt(i)==' ') && (s1.charAt(i+1)!=' '))
		   {
			 count++;   
		   }
	   }
	   System.out.println("String Has "+count+" words");
}
}
