//  to reverse a linked list 
//input 5 4 3 2 1
//output 3 4 5 1 2 
import java.util.*;
class reverse
{

static class Node
{
	int data;
	Node next;
}
static Node head = null;


static Node Reverse(Node head, int k)
{
	Stack<Node> mystack = new Stack<Node> ();
	Node current = head;
	Node prev = null;

	while (current != null)
	{

		int count = 0;
		while (current != null && count < k)
		{
			mystack.push(current);
			current = current.next;
			count++;
		}

		while (mystack.size() > 0)
		{

			if (prev == null)
			{
				prev = mystack.peek();
				head = prev;
				mystack.pop();
			}
			else
			{
				prev.next = mystack.peek();
				prev = prev.next;
				mystack.pop();
			}
		}
	}

	prev.next = null;

	return head;
}


static void Insert( int new_data)
{
	Node new_node = new Node();

	new_node.data = new_data;

	new_node.next = head;

	head = new_node;
}

static void printList(Node node)
{
	while (node != null)
	{
		System.out.print(node.data + " ");
		node = node.next;
	}
}

public static void main(String[] args)
{

	Insert( 1);
	Insert( 2);
	Insert( 3);
	Insert( 4);
	Insert( 5);


	System.out.println("created linkrd list is ");
	printList(head);
	head = Reverse(head, 3);
	System.out.println();

	System.out.println("linked list after reversing is ");
	printList(head);
}
}