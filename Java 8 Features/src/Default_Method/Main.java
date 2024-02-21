package Default_Method;

@FunctionalInterface
interface One
{
	abstract void display();
	default void m1()
	{
		System.out.println("Default Method");
	}
	
}

class Test implements One
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Main
{
  public static void main(String[] args) 
  {
	   Test t=new Test();
	          t.m1();
   }

}

