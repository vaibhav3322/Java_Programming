package Lambda_Expression;

import com.java.practice.Calculation;

@FunctionalInterface
//it is an interface which contains only one abstract method.
interface oneplus
{
	public void display(int x,int y);
	//public void m1();
}

public class Exam
{
	
	public static void main(String[] args)
	{
		   Calculation c=(x, y) ->  System.out.println(x+y);
			           c.add(10, 5);
		
	    	 oneplus p=(x, y)->System.out.println(x+y);
	    	 
	    	 oneplus p1=(x,y)->System.out.println(x-y);
	    	 
	    	 oneplus p2=(x, y)->System.out.println(x*y);
	    	 
	    	 oneplus p3=(x, y)->System.out.println(x/y);
	    	 p.display(20,40);
	    	 p1.display(20,10);
	    	 p2.display(6, 5);
	    	 p3.display(10, 2);
	}
}