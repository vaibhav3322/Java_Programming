package Logical_Programs;

import java.util.Scanner;

public class CharIsVowelOrNot
{
    public static void main(String[] args) 
    {
//	   Scanner sc=new Scanner(System.in);
//	    System.out.println("Enter the character : ");
//	    Character ch=sc.next().charAt(0);
//	    
//	    if(((ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U') ) || ((ch=='a') || (ch=='e')
//	    		|| (ch=='i') || (ch=='o') || (ch=='u')))
//	    {
//	    	System.out.println("Character Is Vowel");
//	    }
//	    
//	    else {
//			System.out.println("Charater is not vowel");
//		}
    	
    	 Scanner sc=new Scanner(System.in);	    
    	 System.out.println("Enter the String : ");//vaibhav
	      String s1=sc.next();
	      
	      for(int ch=s1.length()-1 ; ch>=0 ; ch++ )
	      {
	    	  if(((ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U') ) || ((ch=='a') || (ch=='e')
  	    		|| (ch=='i') || (ch=='o') || (ch=='u')))
	    	  {
	    		  System.out.println("String Contains Vowel");
	    	  }
	    	  else {
	  			System.out.println("String does not contains vowel");
	  		}
	      }
	      
	}
}
