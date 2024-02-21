package com.java.staticmethod;

public class StaticImplementation
{
	private String s1="Vaibhav";
	
	public StaticImplementation()
	{
		System.out.println("constructor from static ");
	}
	public void add()
	{
		System.out.println("public add method from staticImplmentation class ");
	}
   public static void m1()
   {
	   System.out.println("static m1 from class staticImplmentation");
   }
   
   static 
   {
	   System.out.println("static block");
   }
   
   {
	   System.out.println(" non static block");
   }
}
