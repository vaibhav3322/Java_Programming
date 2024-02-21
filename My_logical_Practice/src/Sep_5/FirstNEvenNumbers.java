package Sep_5;

public class FirstNEvenNumbers 
{
 public static void main(String[] args) {
	
	 int no=10;
	 int count=0;
	 
	 for(int i=1; i<=10; i++)
	 {
		 
		 if(i%2 == 0)
		 {
			 System.out.println(i+ " ");
			 count++;
		 }
	 }
	 
	  System.out.println("Even numbers count :");
	  System.out.println(count);
}
}
