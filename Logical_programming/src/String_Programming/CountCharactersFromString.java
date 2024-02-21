package String_Programming;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersFromString
{
   public static void OccuranceOfCharacter(String name)
   {
	   Map<Character, Integer> map1=new HashMap<Character, Integer>();
	   
	   char StringArr [] = name.toCharArray();
	   
	  for(char c  : StringArr)
	  {
		  if(map1.containsKey(c))
		  {
			  map1.put(c, map1.get(c)+1);
		  }
		  else 
		  {
			  map1.put(c,1);
		    }
	  }
	   System.out.println(name +" " +map1);
   }
   
   public static void main(String[] args) 
   {
	   OccuranceOfCharacter("vaibhav");
	   OccuranceOfCharacter("shelke");
   }
}
