package linkedlist;

public class MyLinkedList {
		
	// Add Node
	// Delete Node
	//Find Node
		Node head;
		Node tail;
		
		public void add(Node node)
		{
			if (node == null)
			{
				head = node;
				tail =node;
			} 
			else
			{
				tail = node;
				tail.nextNode = node;
				
			}
		}
}
