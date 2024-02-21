package com.practice.Nov23;

public class ReverseString 
{
  public static void main(String[] args) {
	
	  String s1="maxmin";
	  int s1Length=s1.length()-1;
	  
	  String result="";
	  
	  for(int i=0; i<=s1Length; i++)
	  {
		  result=s1.charAt(i)+result;
	  }
	  
	  System.out.println("Reverse of the String "+"maxmin "+"is "+result);
}
}
