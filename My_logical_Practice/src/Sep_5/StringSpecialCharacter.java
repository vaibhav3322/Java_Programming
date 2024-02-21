package Sep_5;

public class StringSpecialCharacter 
{
   public static void main(String[] args) {
	
	   String s1="Vai@#$";
	   int count=0;
	   String next="";
	   String withNoSpeCharcter="";
	   
	   for(int i=0;i<s1.length();i++)
	   {
		   if(!Character.isDigit(s1.charAt(i)) && !Character.isLetter(s1.charAt(i)) && !Character.isWhitespace(s1.charAt(i)))
		   {
			   char ch=s1.charAt(i);
			   next=next+ch;
			   count++;
		   }
		   else
		   {
			   withNoSpeCharcter=withNoSpeCharcter+s1.charAt(i);
			   
		   }
	   }
	   System.out.println("Speacial Characters in string :"+next);
	   System.out.println("String with No Speacial Characters :"+withNoSpeCharcter);
	   
	   if(count==0)
	   {
		   System.out.println("String has no spe charac :");
	   }
	   else
	   {
		   System.out.println("String has  spe charac :"+count);
	   }
}
}
