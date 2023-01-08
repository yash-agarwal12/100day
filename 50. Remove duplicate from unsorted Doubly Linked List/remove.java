class remove
{
	
static class Node
{
	int data;
	Node next;
	Node prev;
}


static Node deleteNode(Node head_ref, Node del)
{
	if (head_ref == null || del == null)
		return head_ref;

	if (head_ref == del)
		head_ref = del.next;
	if (del.next != null)
		del.next.prev = del.prev;
	if (del.prev != null)
		del.prev.next = del.next;
	return head_ref;
}

static Node RemoveTheDuplicates(Node head_ref)
{
	if ((head_ref) == null ||
		(head_ref).next == null)
		return head_ref;;

	Node ptr1, ptr2;
	for (ptr1 = head_ref;
		ptr1 != null; ptr1 = ptr1.next)
	{
		ptr2 = ptr1.next;

		while (ptr2 != null)
		{
			if (ptr1.data == ptr2.data)
			{
				Node next = ptr2.next;
				head_ref = deleteNode(head_ref, ptr2);
				ptr2 = next;
			}

			else
				ptr2 = ptr2.next;
		}
	}
	return head_ref;
}


static Node push(Node head_ref, int new_data)
{
	Node new_node = new Node();

	new_node.data = new_data;


	new_node.prev = null;

	new_node.next = (head_ref);

	if ((head_ref) != null)
		(head_ref).prev = new_node;
	(head_ref) = new_node;
	return head_ref;
}


static void printList( Node head)
{
	if (head == null)
		System.out.print("Doubly Linked list empty");

	while (head != null)
	{
		System.out.print( head.data + " ");
		head = head.next;
	}
}

public static void main(String args[])
{
	Node head = null;

	head = push(head, 10);
	head = push(head, 10);
	head = push(head, 1);
	head = push(head, 41);
	head = push(head, 42);
	head = push(head, 41);
	head = push(head, 8);

	System.out.print(" Doubly linked list:\n");
	printList(head);

	head=RemoveTheDuplicates(head);

	System.out.print("\nDoubly linked list after" +
						" removing duplicates:\n");
	printList(head);
}
}