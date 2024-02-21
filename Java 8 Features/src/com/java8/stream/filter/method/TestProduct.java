package com.java8.stream.filter.method;

import java.util.ArrayList;
import java.util.List;

public class TestProduct 
{
   public static void main(String[] args) {
	 
	   List<Product> li=new ArrayList<Product>();
	   li.add(new Product(1, "Apple Laptop", 95000f));
	   li.add(new Product(2, "HP Laptop", 55000f));
	   li.add(new Product(3, "Dell Laptop", 75000f));
	   li.add(new Product(4, "Asus Laptop", 65000f));
	   li.add(new Product(5, "x Laptop", 45000f));
	   
	   li.stream().filter(s->s.pprice>50000f).forEach(System.out::println);
}
}
