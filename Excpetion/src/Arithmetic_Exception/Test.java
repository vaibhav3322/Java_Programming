package Arithmetic_Exception;

import java.io.ObjectInputStream.GetField;

public class Test
{
  public static void main(String[] args) {
	 
	  try {
		  System.out.println(10/0);
		
	     } 
	  catch (ArithmeticException e)
	  {
		System.out.println("It is Arithmetic Exception" +e.getMessage());
	   }
}
}
