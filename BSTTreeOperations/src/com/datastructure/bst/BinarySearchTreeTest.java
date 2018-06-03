/**
 * 
 */
package com.datastructure.bst;

import org.junit.Test;

/**
 * @author JK
 *
 */
public class BinarySearchTreeTest {
	
	@Test
	public  void addMethod() {
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(10);
		tree.add(30);
		tree.add(100);
		tree.add(25);
		tree.add(60);
		tree.add(80);
		tree.add(1);
		tree.add(75);
		tree.add(65);
		tree.add(85);
		
		tree.traverse();
		
	}
}
