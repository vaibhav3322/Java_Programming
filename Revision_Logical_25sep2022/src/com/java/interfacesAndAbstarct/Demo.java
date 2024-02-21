package com.java.interfacesAndAbstarct;

public abstract class Demo 
{
	static int num=1;
	final int num1=2;
	int num3=4;
	
   public Demo() {
	// TODO Auto-generated constructor stub
	   System.out.println("constructor of abstract class");
	   
}
   static void main()
   {
	   System.out.println("static method from abstract class Demo");
   }
   
   public static void main(String[] args) {
	
	   Demo.main();
}
}
