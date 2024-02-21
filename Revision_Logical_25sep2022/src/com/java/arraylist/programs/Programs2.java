package com.java.arraylist.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Programs2 
{
    public static void main(String[] args) {
		
    	List<String> topCompanies=new ArrayList<String>();
    	           topCompanies.add("Google");
    	           topCompanies.add("Amazon");
    	           topCompanies.add("Microsoft");
    	           topCompanies.add("Apple");
    	           //topCompanies.add(1);
    	           
    	           //Iterate ArrayList using Iterator
//    	           Iterator itr=topCompanies.iterator();
//    	           while(itr.hasNext())
//    	           {
//    	        	   System.out.println(itr.next());
//    	           }
    	           System.out.println(topCompanies);
    	           // for finding size
    	           System.out.println(topCompanies.size());
    	           // to get bestCompany size
    	           String bestCompany=topCompanies.get(0);
    	           System.out.println("Best Company :"+bestCompany);
    	           
    	           // to get bestCompany size
    	           String secondBestCompany=topCompanies.get(1);
    	           System.out.println("Second Best Company :"+secondBestCompany);
    	           
    	           // to last bestCompany size
    	           String lastCompany=topCompanies.get(topCompanies.size()-1);
    	           System.out.println("last Company :"+lastCompany);
    	           
    	           // set the company name at index 2 then use set() method
    	           topCompanies.set(2, "Oracle");
    	           System.out.println("New Compant List Using Set function :"+topCompanies);
    	           
    	           // set the company name at index 2 then use set() method
    	           topCompanies.add(2, "Meta");
    	           System.out.println("New Compant List Using add function :"+topCompanies);
    	           
    	           // check arralist is empty or not
    	          
    	           System.out.println("ArrayList of top companies is empty ? :"+ topCompanies.isEmpty());
    	           
	}
}
