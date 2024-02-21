package com.java.staticmethod;

public class Test extends StaticImplementation
{
	public static void m1()
	{
		System.out.println("m1 from Test");
	}
	
	
	
   public static void main(String[] args) 
   {
	
	  Test t=new Test();
         Test.m1();
          
       StaticImplementation.m1();
//	         t.add();
	         
//       StaticImplementation op=new StaticImplementation();
//	        StaticImplementation.m1();
//	        op.add();
	       
	         
	        
    }
}
