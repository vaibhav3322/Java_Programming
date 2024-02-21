package Logical_Programs;

public class CountWordsInString 
{
   public static void main(String[] args) {
	
	   String s="My Hobby is painting";// 4 words and 3 whitespaces
	   
	   int count=1;
	   
	   for(int i=0;i<s.length()-1;i++)
	   {
		   
		   if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
		   {
			   count++;
		   }
	   }
	   
	   System.out.println("No of words in a string" +count);
}
}
