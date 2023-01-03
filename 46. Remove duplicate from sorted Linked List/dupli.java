class dupli
{
	Node head; 

	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

	void removeDuplicates()
	{
		Node curr = head;

		while (curr != null) {
			Node temp = curr;
		
			while(temp!=null && temp.data.equals(curr.data)) {
				temp = temp.next;
			}
			
			curr.next = temp;
			curr = curr.next;
		}
	}
					

	public void push(int new_data)
	{

		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void printList()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		dupli llist = new dupli();
		llist.push(2);
		llist.push(1);
		llist.push(3);
		llist.push(1);
		llist.push(11);
		llist.push(1);
		
		System.out.println("List before removal of duplicates");
		llist.printList();
		
		llist.removeDuplicates();
		
		System.out.println("List after removal of elements");
		llist.printList();
	}
}