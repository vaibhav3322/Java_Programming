package vom.java.programs.arrays;

public class Program1 
{
   public static void main(String[] args) {
	
	   int ages [] = {11,22,33,44,55,66};
	   int sum =0;
	   System.out.println("Numbers in an array");
	   // advance for loop
	   for(int num : ages)
	   {
		   System.out.print(num +" ");
	   }
	   
	   // normal for loop
	   for(int i=0; i<ages.length;i++)
	   {
		 
		   sum=sum + ages[i];
	   }
	   System.out.println();
	   System.out.println("sum of numbers in an array");
	   System.out.println(sum);
	 
	   
}
}
