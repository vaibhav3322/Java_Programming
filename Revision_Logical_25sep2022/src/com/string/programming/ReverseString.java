package com.string.programming;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args)
	{
		// 1. Reverse Using stringBuilder
	
//               String s1="Apple";
//    
//                StringBuilder  sb=new StringBuilder();
//                     sb.append(s1);
//                     
//                  System.out.println("Reverse of the String is :"+sb.reverse());
		
		// 2. Reverse Using String method charAt()
		
//		     Scanner sc=new Scanner(System.in);
//		     System.out.println("Enter The String Here :");
//		     String str=sc.next();
//		     
//		     int length=str.length()-1; String next="";
//		     Character ch;
//		     
//		     for(int i=length; i>=0 ; i--)
//		     {
//		    	 ch=str.charAt(i);//l//l
//		    	 next=next+ch;//l+empty=l
//		     }
//		     
//		     System.out.println("Reverse Of The String Is :"+next);
//    

	
	    String s1="maxmin";
	    String next="";
	    char ch;
	    int slen=s1.length()-1;
	    for(int i=slen;i>=0;i--)
	    {
	    	ch=s1.charAt(i);
	    	next=next+ch;
	    }
	    
	    
	    
	    
	    
	    
	    
	}    
	    
	    
              
}
