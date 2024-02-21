package com.practice.Nov23;

public class PalindromeString 
{
   public static void main(String[] args) {
	
	   String s="faf";
	   
	   int strLength=s.length()-1;
	   
	   String result=""; String original_String_s=s;
	   
	   for(int i=0; i<=strLength; i++)
	   {
		   result=s.charAt(i)+ result;
	   }
	   
	   if(original_String_s.equals(result))
	   {
		   System.out.println(result + " is a palindrome");
	   }
	   else
	   {
		   System.out.println(result + " is not palindrome");
	   }
}
}
