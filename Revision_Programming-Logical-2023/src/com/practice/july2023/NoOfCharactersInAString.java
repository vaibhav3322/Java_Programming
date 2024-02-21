package com.practice.july2023;

public class NoOfCharactersInAString 
{
    public static void main(String[] args) {
		
    	String str="sachins";
    	
    	int total_length=str.length();
    	
    	int length_after_removing_s=str.replace("s","").length();
    	int length_after_removing_a=str.replace("a","").length();
    	int length_after_removing_c=str.replace("c","").length();
    	int length_after_removing_h=str.replace("h","").length();
    	int length_after_removing_i=str.replace("i","").length();
    	int length_after_removing_n=str.replace("n","").length();
    	
    	int countOfS=total_length-length_after_removing_s;
    	int countOfA=total_length-length_after_removing_a;
    	int countOfC=total_length-length_after_removing_c;
    	int countOfH=total_length-length_after_removing_h;
    	int countOfI=total_length-length_after_removing_i;
    	int countOfN=total_length-length_after_removing_n;
    	
    	System.out.println("count of s -->> "+countOfS);
    	System.out.println("count of a -->> "+countOfA);
    	System.out.println("count of c -->> "+countOfC);
    	System.out.println("count of h -->> "+countOfH);
    	System.out.println("count of i -->> "+countOfI);
    	System.out.println("count of n -->> "+countOfN);
	}
}
