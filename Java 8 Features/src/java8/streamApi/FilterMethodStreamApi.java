package java8.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethodStreamApi
{
   public static void main(String[] args) {
	
	    List<String> li=Arrays.asList("Man","Fan","Fun","Fool");
	    
	          //List<String>//
	          //newStrings=//
	        		  li.stream().filter(str -> str.startsWith("F")).forEach(System.out::println);
	          //System.out.println(newStrings);
	          
	          List<Object> list1=new ArrayList<Object>();
	          list1.add(1);
	          list1.add("rev");
	          list1.add(1);
	          list1.add("rev");
	          
	          System.out.println(list1);
	          
}
}
