package com.java.logical;

public class FactorialOfNumber
{
  public static void main(String[] args) {
	
	  int num=5;
	  int fact=1;
	  
	  for(int i=1;i<=num;i++)
	  {
		  fact=fact*i;
	  }
	  System.out.println("Factorials of " +num+" : "+fact);
}
}

class B
{
	public static void main(String[] args) {
		

	String s1="max";
	char ch;
	String next="";
	int slen=s1.length()-1;
	for(int i=slen;i>=0;i--)
	{
		ch=s1.charAt(i);
		next=next+ch;
	}
	System.out.println(next);
	}
}