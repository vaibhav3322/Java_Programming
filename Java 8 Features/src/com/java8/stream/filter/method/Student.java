package com.java8.stream.filter.method;

public class Student 
{
   private int sid;
   private String sname;
   private String saddress;
   
   public Student()
   {
	   
   }
   public Student(int sid,String sname,String saddress)
   {
	   this.sid=sid;
	   this.sname=sname;
	   this.saddress=saddress;
   }
   public void setSid(int sid)

   {
	   this.sid=sid;
   }
   public int getSid()
   {
	   return sid;
   }
   public void setSname(String sname)
   {
	   this.sname=sname;
   }
   public String getSname()
   {
	   return sname;
   }
   public void setSaddress(String saddress)
   {
	   this.saddress=saddress;
   }
   public String getSaddress()
   {
	   return saddress;
   }
   public String toString()
   {
	   return "Student [sid=" + sid + ", sname="+sname+", saddress="+saddress+"]";
   }
}
