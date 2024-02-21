package com.java.jdbc;

import java.sql.*;

public class TestJdbc
{
   public static void main(String[] args) {
	
	   try {
		   System.out.println("Jbdc class run succesfully");
		   // step 1 register driver class name
		   Class.forName("com.mysql.jdbc.Driver");
		   
		   System.out.println("Register succesfully");
		   //step 2 create connection 
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vaibhav","root","root");
		   
		   System.out.println("connection success");
		   //step 3 create Statement
		   Statement stm=con.createStatement();
		   // step 4 execute Query
		   ResultSet rs=stm.executeQuery("select * from data");
		   while(rs.next())
		   {
			   System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getString(3));
		   }
		   con.close();
		
	} catch (Exception e) 
	   {
	     System.out.println(e);
		 
	}
}
}
