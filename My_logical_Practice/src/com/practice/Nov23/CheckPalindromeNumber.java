package com.practice.Nov23;

public class CheckPalindromeNumber 
{
   public static void main(String[] args) {
	
	   int num=192;
	   
	   int rem, palindrome=0;
	   int original_Num=num;
	   
	   while(num != 0)
	   {
		   rem = num % 10 ;
		   palindrome = palindrome * 10 + rem;
		   num = num / 10;
	   }
	   
	   if(original_Num == palindrome)
	   {
		   System.out.println("Number is palindrome = "+palindrome);
	   }
	   else
	   {
		   System.out.println("Number is  not palindrome "+palindrome);
	   }
}
}
