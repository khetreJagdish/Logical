package com.lara;

public class StringPerformence {
	
	public static void main(String[] args) {
		
		String s1 = "JAVA";
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			
			s1 = s1 + "J2EE";
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time Taken By String : "+ (endTime - startTime));
		System.out.println("==============================");
		StringBuffer sb = new StringBuffer("JAVA");
      startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			
			sb.append("J2EE") ;
		}
		 endTime = System.currentTimeMillis();
		 System.out.println("Time Taken By StringBuffer : "+ (endTime - startTime));
		 System.out.println("==============================");
		 
		 StringBuilder sbr = new StringBuilder("JAVA");
	      startTime = System.currentTimeMillis();
			
			for (int i = 0; i < 10000; i++) {
				
				sb.append("J2EE") ;
			}
			 endTime = System.currentTimeMillis();
			 System.out.println("Time Taken By StringBuilder : "+ (endTime - startTime));
			 System.out.println("==============================");
	}
}
