package com.practice.july2023;

public class ReverseStringggg 
{
     public static void main(String[] args) {
		
    	 String str="name";
         
         int lengthOfString=str.length()-1;
         
         String reverseOfString="";
         
         for(int i=0;i<=lengthOfString;i++)
         {
        	 reverseOfString=str.charAt(i)+reverseOfString;
         }
         System.out.println("Rev of String "+reverseOfString);
	}
}
