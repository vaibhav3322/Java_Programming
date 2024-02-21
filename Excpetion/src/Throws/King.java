package Throws;

public class King 
{
	
	  public static void calculate() throws ArithmeticException,ArrayIndexOutOfBoundsException
	  {
		  int num=10/0;
	  }
     public static void main(String[] args) 
     {
		try 
		{
			calculate();
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Arithmetic Exception Thrown");
			System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
		   // System.out.println("");	
		}
	 }
}
