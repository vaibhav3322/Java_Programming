package com.java.interfacesAndAbstarct;

public interface Hero
{
   public void m1();
  
   static void animal()
   {
	   System.out.println("static in interface Hero");
    }
   
   public static void main(String[] args) {
	
//	   Hero h=new Hero();
//	       h.m1();
	       Hero.animal();
}
}
