package com.java.inheritance;

public class Parent 
{
	static int p1;
	int q;
   public static void m1()
   {
	   System.out.println("static method m1 from Parent");
   }
   
   public void m2()
   {
	   System.out.println("m2 method non static from Parent");
   }
   
   static
   {
	   p1=50;
	   System.out.println("static variable p1 value :"+p1);
	   int c=20+30;
	   System.out.println("sum in static block :"+c);
   }
   {
	   System.out.println("Non static block");
   }
  
}
