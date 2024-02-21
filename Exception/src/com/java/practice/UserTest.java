package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class User {
	
	private int userid;
	private String userName;
	private int age;
	
	
	
	public User(int userid, String userName, int age) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.age = age;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", userName=" + userName + ", age=" + age + "]";
	}
	
	
	
	

}

public class UserTest { 
	 
	public static void main(String[] args) {
		
		List<User> user1 =Arrays.asList(new User(1, "srinavs", 30)
				,new User(2, "vaibhav", 25), new User(3, "rajesh", 22),
				new User(1, "vikram", 36));
		
		     
//		List<User> user2 = user1.stream()
//				.sorted(Comparator.comparingInt(User::getUserid).thenComparing(User::getUserName)).collect(Collectors.toList());
//		
//			         user2.forEach(n -> System.out.println(n.getUserid()+ " " +n.getUserName()));
		
		
		
		List<String> li =user1.stream().filter(a -> a.getUserid()==1).map(a1 -> a1.getUserName()).collect(Collectors.toList());
		
		//System.out.println(li);
		
		
		           
		            
		           
		
	}
}
