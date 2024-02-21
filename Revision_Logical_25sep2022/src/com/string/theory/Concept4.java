package com.string.theory;

//How many objects are created in following code snippet.
//In this case it will have 3 objects

public class Concept4
{
     public static void main(String[] args) 
     {
    	 String str=new String("Persistent");//Object str will be created = 1 in Heap + 1 in Scp.
    	 String str1=new String("Persistent");// Object str1 will be created  = 1 in Heap.
    	 
    	 System.out.println(str.equals(str1));
    	 
    	 System.out.println(str == str1);
    	 
    	 System.out.println(str.hashCode());
    	 System.out.println(str1.hashCode());
	   }
}
