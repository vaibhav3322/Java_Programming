package Sep_5;

import java.util.Scanner;

public class AlphabetOrNot 
{
   public static void main(String[] args) {
	
    
     String s1="My Name Is Vaibhav";
     int count=1;
     
     for(int i=0;i<s1.length();i++)
     {
    	 if((s1.charAt(i)==' ') && !(s1.charAt(i+1)==' '))
    	 {
    		 count++;
    	 }
     }
 
     System.out.println("No Of Words In A String :"+count);
     
  
}
}
