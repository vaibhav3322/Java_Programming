package Sep_5;

import java.util.Scanner;

public class SumOfNNumbers 
{
  public static void main(String[] args) {
	
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter first N number to get sum");
	  int num =sc.nextInt();
	  
	  int sum = 0;
	  
	  for(int i=1; i<=num;i++)
	  {
		  sum= sum + i;
	  }
	  
	  System.out.println("sum of first "+num+ " numbers is : "+sum);
}
}
