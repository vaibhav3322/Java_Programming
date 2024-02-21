package com.java.mainmethod.scenario;

public class Testing 
{
   int a=1;
   
   public void add()
   {
	   System.out.println("add method from Testing class ");
   }
   
   public static void main(String[] args) {
	
	      Testing t=new  Testing();
	      System.out.println(t.a);	
	      t.add();
	      
	      
     }
   

}
