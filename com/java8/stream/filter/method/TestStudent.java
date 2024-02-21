package com.java8.stream.filter.method;

import java.util.ArrayList;
import java.util.List;

public class TestStudent 
{
   public static void main(String[] args) {
	
	   List<Student> list=new ArrayList<Student>();
                     list.add(new Student(11,"Vaibhav","Akola"));
                     list.add(new Student(12,"Sagar","Akola"));
                     list.add(new Student(13,"Tushar","Pune"));
                     list.add(new Student(14,"Dinesh","Mumbai"));
                     
                     list.stream().filter(s->s.getSaddress().equals("Pune") || s.getSaddress().equals("Mumbai")).forEach(System.out::println);
                     
                     list.stream().filter(s -> s.getSaddress().equals("Akola")).forEach(System.out::println);
   
   
   
   }
}
