package String_Programming;

import java.util.Scanner;

public class String_Length
{
   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the String to find length");
	   String s1=sc.nextLine();
	   
	   System.out.println("Length of the String" + " " + s1 + " : " +s1.length());
    }
}
