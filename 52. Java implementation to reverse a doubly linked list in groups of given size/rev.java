import java.io.*;
import java.util.*;

// Represents a node of doubly linked list
class Node
{
	int data;
	Node next, prev;
}

class rev
{

	static Node getNode(int data)
	{

		Node new_node = new Node();
		new_node.data = data;
		new_node.next = new_node.prev = null;

		return new_node;
	}

	static Node push(Node head, Node new_node)
	{

		new_node.prev = null;

		new_node.next = head;

		if (head != null)
			head.prev = new_node;

		head = new_node;
		return head;
	}

	static Node reverseLinkedList(Node head, int k)
	{
		Node current = head;
		Node next = null;
		Node newHead = null;
		int count = 0;

		while (current != null && count < k)
		{
			next = current.next;
			newHead = push(newHead, current);
			current = next;
			count++;
		}

		if (next != null)
		{
			head.next = reverseLinkedList(next, k);
			head.next.prev = head;
		}
		return newHead;
	}
	static void printList(Node head)
	{
		while (head != null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String args[])
	{
		Node head = null;

		head = push(head, getNode(23));
		head = push(head, getNode(5));
		head = push(head, getNode(28));
		head = push(head, getNode(3));
		head = push(head, getNode(9));
		head = push(head, getNode(7));

		int k = 3;	
		System.out.print("linked list is ");
		printList(head);
		head = reverseLinkedList(head, k);
		System.out.print("\nModified  linked list is: ");
		printList(head);
	}
}