package Logical_Programs;

import java.util.Scanner;

public class OldestByAge 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age Of A :");	//10
        int A=sc.nextInt();
        
        System.out.println("Enter Age Of B :");	//20
        int B=sc.nextInt();
        
        System.out.println("Enter Age Of C :");	//30
        int C=sc.nextInt();
        
            if(A>B && A>C)
            {
            	System.out.println("A Is the Oldest One");
            }
            else if (B>C) 
            {
            	System.out.println("B Is the Oldest One");
			}
            else
            {
            	System.out.println("C Is the Oldest One");
            }
	}
   
}
