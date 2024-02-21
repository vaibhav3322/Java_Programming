package Sep_5;

import java.util.Scanner;

public class SpecialCharacterInString
{
   public static void main(String[] args) {
	
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter String With Special or no Special Characters :");
	   String str=sc.next();
	   
	   String next=""; int count =0; String WithnoSpecialsCharacters="";
	   
	   for(int i=0; i<str.length(); i++)
	   {
		   if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i)))
		   {
			   Character ch=str.charAt(i);
			   next=next+ch;
			   count++;
		   }
		   else
		   {
			  WithnoSpecialsCharacters=WithnoSpecialsCharacters+str.charAt(i);   
		   }
	   }
	   System.out.println("Specials Characters In String :"+next);
	   System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	   System.out.println("No Specials Characters In String :"+WithnoSpecialsCharacters);
	   
	   if (count == 0)
	   {
		  System.out.println("String does not contains Special Characters :");
	   }
	   else
	   {
		   System.out.println("String contains Special Characters :"+count);
	   }
}
}
