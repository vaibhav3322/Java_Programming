package com.java.practice.dec_6;

public class ReverseString 
{
   public static void main(String[] args) {
	
	   String str="male";
	   
	   String result=""; int lengthOfString=str.length()-1;
	   
	   for(int i=0; i<=lengthOfString; i++)
	   {
		   result=str.charAt(i)+result;
	   }
	   System.out.println("Reverse of the String -->> " +str+ " is : "+result  );
}
}
