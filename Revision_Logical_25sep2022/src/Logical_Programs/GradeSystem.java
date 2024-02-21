package Logical_Programs;

import java.util.Scanner;

public class GradeSystem
{
     public static void main(String[] args) {
		
    	   Scanner sc = new Scanner(System.in);
    	    System.out.println("Enter the Students Marks : ");
    	    float marks=sc.nextFloat();
    	    
    	    if(marks<20)
    	    {
    	    	System.out.println("Grade : F");
    	    }
    	    else if (marks>=20 && marks<40) 
    	    {
    	    	System.out.println("Grade : E");
			}
    	    else if (marks>=40 && marks<60) 
    	    {
    	    	System.out.println("Grade : D");
			}
    	    else if (marks>=60 && marks<80) 
    	    {
    	    	System.out.println("Grade : C");
			}
    	    else if (marks>=80 && marks<90) 
    	    {
    	    	System.out.println("Grade : B");
			}
    	    else if (marks>=90) 
    	    {
    	    	System.out.println("Grade : A");
			}
	}
}
