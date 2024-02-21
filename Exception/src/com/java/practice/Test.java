package com.java.practice;

public class Test {
	
	public static void main(String[] args) {
		
		int count[] = new int[2];
		
		try {
			System.out.println("3 rd element" +count[3]);
		}
			
//	} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("out of" +e);
//		}
		
			
			finally {
				//System.exit(0);
				System.out.println("finally block");
			}
		
			
		
	}

}
