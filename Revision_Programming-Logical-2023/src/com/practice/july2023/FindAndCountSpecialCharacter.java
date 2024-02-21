package com.practice.july2023;


public class FindAndCountSpecialCharacter 
{
    public static void main(String[] args)
    {
	     String str="Cre$%^&ta", withSpecialCharacter="", withNoSpecialCharacter="";
	     int count=0; 
	     
	     for(int i=0 ; i<=str.length()-1 ;i++)
	     {
	    	 if(!Character.isWhitespace(str.charAt(i)) && !Character.isDigit(str.charAt(0)) && !Character.isLetter(str.charAt(i)) )
		     {
		    	 withSpecialCharacter=withSpecialCharacter+str.charAt(i);
		    	 count++;
		     }
	    	 else {
				withNoSpecialCharacter=withNoSpecialCharacter+str.charAt(i);
				
			}
	    
	     }
	     System.out.println("Special Character From String are : "+withSpecialCharacter);
	     System.out.println("With No Special Character From String are : "+withNoSpecialCharacter);
	     
	     if(count==0)
	     {
	    	 System.out.println("String Dont have Special Character");
	     }
	     else
	     {
	    	 System.out.println("String Contains Special Character : "+count);
	     }
	}
}
