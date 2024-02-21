package com.Iist.array;

public class FindDuplicatesFromArray
{
  public static void main(String[] args) {
	
	  String s[] = {"man","cow","fan","fan","Cow","sun","cow"};
	  
	  int count=0;
	  System.out.println("Length of an array :"+s.length);
	  System.out.println(s[1]);
	  for(int i=0;i<s.length;i++)
	  {
		  for(int j=i+1;j<s.length;j++)
		  {
			  if(s[i]==s[j])
			  {
				  System.out.println("Duplicate String found :" +s[i]);
				  count++;
			  }
		  }
	  }
	  System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	  System.out.println("Count of Duplicate String are :"+count);
}
}
