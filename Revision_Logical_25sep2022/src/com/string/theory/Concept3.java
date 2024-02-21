package com.string.theory;

//How many objects are created in following code snippet.
//In this case it will have 2 objects

public class Concept3
{
   public static void main(String[] args)
   {
	   String str=new String("Cricket");// Heap + Scp = 2
	   
	   // It will create 2 objects one in Heap and other in scp area.
	   // Scp is the part of the Heap.
    }
}
