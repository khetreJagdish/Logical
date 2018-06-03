package com.lara;

public class StringBufferBuilderPerformanceDemo {

	public void getPerformanceForStringBuffer()
	{
		StringBuffer sbf = new StringBuffer();
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 20000; i++) {
			sbf.append(i);
			sbf.append(" ");
			sbf.append(i);
			sbf.append(" ");
		}
		System.out.println("Current Time of StringBuffer : " +  (System.currentTimeMillis()-startTime ));
	}
	
	public void getPerformanceForStringBuilder()
	{
		StringBuilder sbl = new StringBuilder();
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 20000; i++) {
			sbl.append(i);
			sbl.append(" ");
			sbl.append(i);
			sbl.append(" ");
		}
		System.out.println("Current Time of StringBuilder : " + (System.currentTimeMillis()-startTime ));
	}
	public static void main(String[] args) {
			
		StringBufferBuilderPerformanceDemo stringBuffeBuildPerfDm = new StringBufferBuilderPerformanceDemo();
		stringBuffeBuildPerfDm.getPerformanceForStringBuffer();
		stringBuffeBuildPerfDm.getPerformanceForStringBuilder();
	}

}
