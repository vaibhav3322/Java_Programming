package Optional_Class;

import java.util.Optional;

public class Main
{
   public static void main(String[] args)
   {
	  Main m=new Main();
	  
	  Integer value1=null;
	  Integer value2=10;
	  
	  Optional<Integer> op=Optional.ofNullable(value1);

	  
	  Optional<Integer> op1=Optional.of(value2);
	  
	 System.out.println(op.isEmpty());// it is null so true
	 System.out.println(op1.isEmpty());// it has value 10 so isEmpty : False
	 
	 System.out.println(op.isPresent());//null means no int value so isPresent : false
	 System.out.println(op1.isPresent());// 
	  
   }
}
