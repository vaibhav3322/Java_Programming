package com.string.programming;

public class CountSpecialCharacter 
{
   public static void main(String[] args) {
	
	   String str="My^Name#$%";
	   String spCharacter="";
	   int count=0;
	   
	   String withNoSpCharacters="";
	   for(int i=0; i<str.length(); i++)
	   {
		    if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))
		    		&& !Character.isWhitespace(str.charAt(i)))
		    {
		    	//char ch=str.charAt(i);
		    	spCharacter=spCharacter+str.charAt(i);
		    	count++;
		    }
		    else
		    {
		    	withNoSpCharacters=withNoSpCharacters+str.charAt(i);
		    }
		   
	   }
	   System.out.println("Special Characters are :"+spCharacter);
	   System.out.println("With no special character :"+withNoSpCharacters);
	   
	   if(count == 0)
	   {
		   System.out.println("String doesnt contains Special characters ");
	   }
	   else {
		
		   System.out.println("String contains special characters :"+count);
	}
}
}
