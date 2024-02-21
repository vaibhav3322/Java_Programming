package com.java.constructor.deflt;

public class Main
{
	 int a;
	  boolean b;
	  String c; char d; long e; short f; double g; float h;

	  public static void main(String[] args) {

	    // A default constructor is called
	    Main obj = new Main();

	    System.out.println("Default Values:");
	    System.out.println("a = " + obj.a);
	    System.out.println("b = " + obj.b);
	    System.out.println("c = " + obj.c);
	    System.out.println("d = " + obj.d);
	    System.out.println("e = " + obj.e);
	    System.out.println("f = " + obj.f);
	    System.out.println("g = " + obj.g);
	    System.out.println("h = " + obj.h);
	  }
}
