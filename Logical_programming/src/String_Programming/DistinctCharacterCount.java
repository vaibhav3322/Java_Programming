package String_Programming;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharacterCount
{
	

		public static void main(String[] args) {

			printDistinctCharsWithCount("abc");
			printDistinctCharsWithCount("abcab3");
			printDistinctCharsWithCount("i am pankaj");
		}

		private static void printDistinctCharsWithCount(String input) 
		{
			Map<Character, Integer> charsWithCountMap = new HashMap<>();

			// using Map merge method from Java 8
			for (char c : input.toCharArray())
				
				charsWithCountMap.merge(c, 1, Integer::sum);
			System.out.println(input+ " " +charsWithCountMap);
			
			
		}
}
