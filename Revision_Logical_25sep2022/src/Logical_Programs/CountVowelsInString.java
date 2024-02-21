package Logical_Programs;

import java.io.IOException;

public class CountVowelsInString
{
   public static void main(String[] args) throws IOException
   {
	    String s1="Vaibhav";
	     s1=s1.toLowerCase();
	     
	     int count=0;
	     System.out.println("Vowels are : ");
	     for(int i=0 ; i<s1.length(); i++)
	     {
	    	 if((s1.charAt(i)=='a') || (s1.charAt(i)=='e') || (s1.charAt(i)=='i') || 
	    			 (s1.charAt(i)=='o') || (s1.charAt(i)=='u'))
	    	 {
	    		 count++;
	    		 
	    		System.out.print(s1.charAt(i)+ " ");
	    	 }
	    	 
	    	 
	     }
	     System.out.println("");
	     if(count>0)
	    	 System.out.println(count);
	     
	     else
	    	 System.out.println("Does not contains vowels ");
	   
	        System.out.println("String Contains "+count+ " Vowels");
    }
}
