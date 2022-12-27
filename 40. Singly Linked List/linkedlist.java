import java.io.*;
public class linkedlist {

	Node head; 

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	public static linkedlist insert(linkedlist list, int data)
	{
		Node new_node = new Node(data);
		

		
		if (list.head == null) {
			list.head = new_node;
		}
		else {
		
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = new_node;
		}

		return list;
	}

	public static void printList(linkedlist list)
	{
		Node currNode = list.head;
	
		System.out.print("LinkedList: ");
	
		while (currNode != null) {
			System.out.print(currNode.data + " ");
	
			currNode = currNode.next;
		}
	}
	
	public static void main(String[] args)
	{
		linkedlist list = new linkedlist();

		
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);

		printList(list);
	}
}