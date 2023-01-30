import java.util.*;
import java.io.*;


class Node
{
	int data;
	Node next, prev;
}

class occurence
{

	static Node DeleteNode(Node head, Node del)
	{
		if (head == null || del == null)
			return null;
		if (head == del)
			head = del.next;


		if (del.next != null)
			del.next.prev = del.prev;
		if (del.prev != null)
			del.prev.next = del.next;

		del = null;

		return head;
	}
	static Node deleteX(Node head, int x)
	{
		if (head == null)
			return null;

		Node current = head;
		Node next;
		while (current != null)
		{
			if (current.data == x)
			{
				next = current.next;
				head = DeleteNode(head, current);
				current = next;
			}
			else
				current = current.next;

		}
		return head;

	}
	static Node push (Node head, int new_data)
	{
		Node new_node = new Node();
				new_node.data = new_data;
		new_node.prev = null;

		new_node.next = head;
		if (head != null)
			head.prev = new_node;
		head = new_node;

		return head;
	}


	static void printList (Node temp)
	{
		if (temp == null)
			System.out.print("Doubly Linked list empty");

		while (temp != null)
		{
				System.out.print(temp.data + " ");
				temp = temp.next;
		}
	}

	public static void main(String args[])
	{
		Node head = null;


		head = push(head, 28);
		head = push(head, 5);
		head = push(head, 5);
		head = push(head, 4);
		head = push(head, 80);
		head = push(head, 10);
		head = push(head, 20);
		head = push(head, 5);

		System.out.println("Original Doubly linked list: ");
		printList(head);

		int x = 5;

		head = deleteX(head, x);
		System.out.println("\nDoubly linked list after deletion of" + x +":");
		printList(head);
	}
}