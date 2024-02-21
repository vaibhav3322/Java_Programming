package Sep_5;

import java.util.HashMap;
import java.util.Map;

public class Character_Occurance
{
    public static void CharacterOccourance(String input)
    {
    	Map<Character,Integer> map = new HashMap<Character, Integer>();
    	
    	char stringArray[] = input.toCharArray();
    	
    	for(char c : stringArray)
    	{
    		if(map.containsKey(c))
    		{
    			map.put(c, map.get(c)+1);
    		}
    		else 
    		{
				map.put(c, 1);
			}
    	}
    	System.out.println(input + " " +map);
    }
    
    public static void main(String[] args) {
		
    	CharacterOccourance("Larsen and");
    	//CharacterOccourance("and");
    	//CharacterOccourance("Toubro");
	}
}
