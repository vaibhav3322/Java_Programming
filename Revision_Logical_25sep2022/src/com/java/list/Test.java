package com.java.list;

import java.util.Arrays;
import java.util.List; 

public class Test
{
   public static void main(String[] args) {
	
	   Patient p1=new Patient("Vaibhav",29,"Corona",5000);
	   Patient p2=new Patient("Dinesh",27,"Fever",5500);
	   Patient p3=new Patient("Ganesh",26,"Corona",1000);
	   Patient p4=new Patient("Akshay",25,"Mumps",2000);
	   Patient p5=new Patient("Deepak",24,"Corona",3000);
	   
	   List<Patient> list=Arrays.asList(p1,p2,p3,p4,p5);
	   
	     list.stream().filter(e -> e.getDisease().equals("Corona") && e.getAge()>25).forEach(System.out::println);
}
}
