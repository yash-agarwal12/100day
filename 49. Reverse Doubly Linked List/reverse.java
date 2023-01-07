class reverse {

	static Node head;

	static class Node {

		int data;
		Node next, prev;

		Node(int d)
		{
			data = d;
			next = prev = null;
		}
	}

	void reversee()
	{
		Node temp = null;
		Node current = head;
		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		if (temp != null) {
			head = temp.prev;
		}
	}

	void push(int new_data)
	{
		
		Node new_node = new Node(new_data);
		new_node.prev = null;
		new_node.next = head;
		if (head != null) {
			head.prev = new_node;
		}
		head = new_node;
	}

	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	public static void main(String[] args)
	{
		reverse list = new reverse();
		list.push(20);
		list.push(45);
		list.push(3);
		list.push(1);

		System.out.println(" linked list ");
		list.printList(head);
				list.reversee();
		System.out.println("");
		System.out.println("The reversed Linked List is ");
		list.printList(head);
	}
}