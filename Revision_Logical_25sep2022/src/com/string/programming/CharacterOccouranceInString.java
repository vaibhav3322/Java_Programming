package com.string.programming;

public class CharacterOccouranceInString
{
    public static void main(String[] args) {
		
    	String s1="AaaBbbCcc";
    	int totalLength=s1.length();
    	
    	//for a
    	int totalLength_afterRemovinga=s1.replace("a","").length();// removing i  and replace with Empty space and calculate length.
    	//for A
    	int totalLength_afterRemovingA=s1.replace("A","").length();
    	//for B
    	int totalLength_afterRemovingB=s1.replace("B","").length();
    	//for b
    	int totalLength_afterRemovingb=s1.replace("b","").length();
    	//for C
    	int totalLength_afterRemovingC=s1.replace("C","").length();
    	//for c
    	int totalLength_afterRemovingc=s1.replace("c","").length();
    	
    	
    	
    	int count_of_a=totalLength-totalLength_afterRemovinga;int count_of_A=totalLength-totalLength_afterRemovingA;
    	int count_of_B=totalLength-totalLength_afterRemovingB;int count_of_b=totalLength-totalLength_afterRemovingb;
    	int count_of_C=totalLength-totalLength_afterRemovingC;int count_of_c=totalLength-totalLength_afterRemovingc;
    	
    	System.out.println("a ="+count_of_a);
    	System.out.println("A ="+count_of_A);
    	System.out.println("B ="+count_of_B);System.out.println("b ="+count_of_b);
    	System.out.println("C ="+count_of_C);System.out.println("c ="+count_of_c);
	}
}
