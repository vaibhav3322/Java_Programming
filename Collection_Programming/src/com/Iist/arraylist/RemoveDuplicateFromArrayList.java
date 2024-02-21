package com.Iist.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromArrayList 
{
     public static void main(String[] args) {
		
    	 List<Integer> li=new ArrayList<Integer>(Arrays.asList(3,4,4,5,5,5,6,9,8,7,7,7,10,1,2,2));
    	 
    	 Set<Integer> lin=new HashSet<>(li);
    	 
    	 System.out.println(lin);
    	 
    	 List<Integer> withoutDuplicates=new ArrayList<Integer>(lin);
    	 System.out.println(withoutDuplicates);
	}
}
