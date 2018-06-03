/**
 * 
 */
package com.lara;

/**
 * @author JK
 *
 */
public class SelectionSortInJava {
	
		public static void selectionSort(int[] inputArray) {
			
			int pos, temp;
			
			for (int i = 0; i < inputArray.length -1; i++) {
				pos = i;
				for (int j = i + 1; j < inputArray.length; j++) {
						if (inputArray[j] < inputArray[pos]) {
							
							pos=j;
						}
					
				}
				
				
				
			}
			
		}
	public static void main(String[] args) {
		
		selectionSort(new int[] {54,45,10,24,3,48,7,6});
	}
}
