package java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Remove odd from list
public class StreamApiExample 
{
    public static void main(String[] args) {
		
    	List<Integer> list1=Arrays.asList(11,20,31,40,51);
    	
    	     Set<Integer> newList=list1.stream().filter(i -> i%2==0).collect(Collectors.toSet());
    	     System.out.println(newList);
    	
	}
}
