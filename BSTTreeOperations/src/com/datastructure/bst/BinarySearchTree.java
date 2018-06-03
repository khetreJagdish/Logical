/**
 * 
 */
package com.datastructure.bst;

/**
 * @author JK
 *
 */
public class BinarySearchTree
{
	
	Node root;
	
	public void add(int data)
	{
		
		Node nodeToAdd = new Node(data);
		if (root == null) {
			root = nodeToAdd;
		}
		traverseAndAddNode(root ,  nodeToAdd);
	}
	
	private void traverseAndAddNode(Node node , Node nodeToAdd)
	{
		
		if (nodeToAdd.data < node.data)
		{
			
			if (node.leftChild == null)
			{
				
			       node.leftChild = nodeToAdd;	
			} 
			else 
			{
					traverseAndAddNode(node.leftChild, nodeToAdd);
			}
		}
		else if(nodeToAdd.data > node.data)
		{
			if (node.rightChild == null)
			{
			       node.rightChild = nodeToAdd;	
			} 
			else 
			{
					traverseAndAddNode(node.rightChild, nodeToAdd);
			}
		}
		
	}
	
	
	public void traverse()
	{
			if (root != null) 
			{
				Node nodeToTraverse = root;
				if(nodeToTraverse.leftChild == null && nodeToTraverse.rightChild == null)
				{
					System.out.println(nodeToTraverse.data);
				}
				else
				{	
						inOrderTraversal(nodeToTraverse);
				}
			}
	}
	public boolean delete(int val)
	{
		
		return true;
	}
	public Node find(int val)
	{
		if (root != null) 
		{
			return findNode(root, new Node(val));
		}
		return null;
	}
	
	/**
	 * @param root2
	 * @param node
	 * @return
	 */
	private Node findNode(Node search, Node node) {
		if (search == null) {
			return null;
		}
		
		if (search.data == node.data) {
			return search;
		}
		else
		{
			Node returnNode = findNode(search.leftChild, node);
			
			if (returnNode == null) {
				
				returnNode = findNode(search.rightChild, node);
			}
		return returnNode;	
		}
		
	}

	private void inOrderTraversal(Node node)
	{
		
		if (node.leftChild != null)
		{
			inOrderTraversal(node.leftChild);
		}
		
		
		if(node.rightChild != null)
		{
			inOrderTraversal(node.rightChild);
		}
		System.out.println(node.data);
	}
	
	
	private class Node
	{
		int data;
		Node leftChild;
		Node rightChild;
		
		public Node() {
			
		}
		public Node(int data)
		{
			this.data = data;
		}
	}
}
