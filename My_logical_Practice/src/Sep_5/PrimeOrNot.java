package Sep_5;

import java.util.Scanner;

//prime means no is divisible by 1 or itself.
// for ex : 5 is prime and divisible by 1 or 5.

public class PrimeOrNot
{
  public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number to check prime or not");
	  int num=sc.nextInt();
	   
	  int count=0;
	  for(int i=1; i<=num ; i++)
	  {
		  if(num % i == 0)
		  {
			  System.out.println();
			  count++;
		  }
	   }
	  if(count==2)
	  {
		  System.out.println(num+" is prime");
	  }
	  else {
		System.out.println(num+" is not prime");
	}
}
}
