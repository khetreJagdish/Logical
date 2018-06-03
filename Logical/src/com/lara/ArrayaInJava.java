/**
 * 
 */
package com.lara;

/**
 * @author JK
 *
 */

class UserDefinedType
{
		int i;
		void methodOne()
		{
			System.out.println("From user defined type method ");
		}
}
public class ArrayaInJava {
	
	public static void main(String[] args) {
		
		UserDefinedType[] userDefinedTypes = new UserDefinedType[10];
		
		for (int i = 0; i < userDefinedTypes.length; i++) {
			
			userDefinedTypes[i] = new UserDefinedType();
		}
		
		userDefinedTypes[1].methodOne();
	}

}
