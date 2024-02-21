package com.practice.Nov23;

public class StringCharacterOccourance2Way
{
   public static void main(String[] args) {
	
	   String s1="Terminate";
	   
	   int total_length=s1.length();
	  // System.out.println("Total length of the String : " +total_length);
	   
	   int length_After_Removing_T=s1.replace("T","").length();
	   int length_After_Removing_e=s1.replace("e","").length();
	   int length_After_Removing_r=s1.replace("r","").length();
	   int length_After_Removing_m=s1.replace("m","").length();
	   int length_After_Removing_i=s1.replace("i","").length();
	   int length_After_Removing_n=s1.replace("n","").length();
	   int length_After_Removing_a=s1.replace("a","").length();
	   int length_After_Removing_t=s1.replace("t","").length();
	   
	   int count_of_T=total_length - length_After_Removing_T;
	   int count_of_e=total_length - length_After_Removing_e;
	   int count_of_r=total_length - length_After_Removing_r;
	   int count_of_m=total_length - length_After_Removing_m;
	   int count_of_i=total_length - length_After_Removing_i; 
	   int count_of_n=total_length - length_After_Removing_n;
	   int count_of_a=total_length - length_After_Removing_a;
	   int count_of_t=total_length - length_After_Removing_t;
	   
	   System.out.println("T ="+count_of_T);
	   System.out.println("e ="+count_of_e);
	   System.out.println("r ="+count_of_r);
	   System.out.println("m ="+count_of_m);
	   System.out.println("i ="+count_of_i);
	   System.out.println("n ="+count_of_n);
	   System.out.println("a ="+count_of_a);
	   System.out.println("t ="+count_of_t);
	   
}
}
