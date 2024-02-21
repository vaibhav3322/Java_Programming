package Finally_Scenario;

public class Test 
{
    public static void main(String[] args) {
		
    	try {
    		
    		System.out.println("try block...");
    		//System.exit(0);//if we use this then finally block code will not execute.
    		
    		
			
		} catch (ArithmeticException e) {
			
			System.out.println("catch block...");
			
		}
    	finally {
    		
    		System.out.println("finally block...");
			
		}
	}
}
