package com.java.constructor.deflt;

public class A 
{
	int a;
	String s;
   
   A()
   {
	   this.s="vaibhav";
	   this.a=10;
	 System.out.println(a);
   }
   A(String s)
   {
	  
   }
   public static void main(String[] args) 
   {
      A a1=new A();
     // A a2=new A();
     // System.out.println(a1);
   }
}
