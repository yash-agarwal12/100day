// to  delete element from
//  singly linked list
//Input 10 20 30 22
//element to be deleted 22
//output 10 20 30 
class delete {
	Node head; 

	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}


	void deleteNode(int key)
	{
		Node temp = head, prev = null;

	
		if (temp != null && temp.data == key) {
			head = temp.next; 
			return;
		}

	
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null)
			return;

		prev.next = temp.next;
	}

	public void push(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	
	public void printList()
	{
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}


	public static void main(String[] args)
	{
		delete llist = new delete();

		llist.push(10);
		llist.push(20);
		llist.push(30);
		llist.push(22);

		System.out.println(" Linked list is:");
		llist.printList();

		llist.deleteNode(22); 

		System.out.println("\nLinked List after Deletion of ");
		llist.printList();
	}
}