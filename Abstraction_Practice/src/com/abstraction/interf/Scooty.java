package com.abstraction.interf;

public class Scooty implements Bike
{
  // int c=60;
	@Override
	public void speed() {
		
		int b=a+45;
        System.out.println("Speed method implemented sum "+b);		
	}
       public static void main(String[] args) {
		
    	   Scooty b=new Scooty();
    	        b.speed();
    	        
    	        System.out.println(b.a);
    	        System.out.println(b.c);
	}
}
