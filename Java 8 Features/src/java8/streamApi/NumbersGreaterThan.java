package java8.streamApi;

import java.util.Arrays;
import java.util.List;

public class NumbersGreaterThan
{
	public static void main(String[] args)
	{
		
	
	// Creating the list
	List<Integer> numList = Arrays.asList(34, 6, 3, 12, 65, 1, 8);
	  numList.stream().filter((n) -> n > 5).sorted().forEach(System.out::println);
	}
}
