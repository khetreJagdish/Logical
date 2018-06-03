package linkedlist;

import org.junit.Test;

public class LinkedListTest {
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(new Node(10));
		list.add(new Node(20));
		list.add(new Node(30));
		list.add(new Node(40));
		
		System.out.println(list);
		
		
	}
}
