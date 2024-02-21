package com.java.arraylist.programs;

import java.util.ArrayList;
import java.util.List;

public class TestPerson 
{
   public static void main(String[] args) {
	
	   List<Person> li=new ArrayList<Person>();
	   
	     li.add(new Person("Vaibhav",30,"Akola"));
	     li.add(new Person("Dinesh",25,"Pune"));
	     li.add(new Person("Umesh",35,"Akola"));
	     li.add(new Person("Rajesh",56,"Pimpri"));
	     
	     li.stream().filter(f -> f.getCity().equals("Akola") && f.getAge()>=30).forEach(System.out::println);
}
}
