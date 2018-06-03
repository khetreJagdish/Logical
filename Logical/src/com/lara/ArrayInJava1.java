/**
 * 
 */
package com.lara;

/**
 * @author JK
 *
 */

public class ArrayInJava1 
{
		static int[] inputArray()
		{	
			int[] a = new int[5];
			// int[] a = new int[5]; //   java.lang.NegativeArraySizeException 
			a[2] = 10;
			a[3] = 20;
			return a;
		}
		
		public static void main(String[] args) {
				
			int[] a = inputArray();
			
			System.out.println(a[2]);
			System.out.println(a[3]);
			
			 Object[] stringArray = new String[5];   //No compile time error : String[] is auto-upcasted to Object[]
	         
		        stringArray[1] = "JAVA";     
		         
		        //stringArray[2] = 100;  // java.lang.ArrayStoreException: java.lang.Integer
		        
		        
		      //Creating anonymous arrays
		        
		        System.out.println(new int[]{1, 2, 3, 4, 5}.length);    //Output : 5
		  
		        System.out.println(new int[]{21, 14, 65, 24, 21}[1]);   //Output : 14

		}
	
	
	
}
