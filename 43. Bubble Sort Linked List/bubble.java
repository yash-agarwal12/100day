public class bubble {
    static class Node {
      int data;
      Node next;
    }
    public Node head;
    bubble() {
      head = null;
    }
    public void insert(int value) {
      Node node = new Node();
      node.data = value;
      node.next = null;
      if (head == null) head = node;
      else {
        Node temp = head;
        while (temp.next != null) {
          temp = temp.next;
        }
        temp.next = node;
      }
    }
    public void display() {
      if (head != null) {
        Node temp = head;
        while (temp != null) {
          System.out.print("  " + temp.data);
          temp = temp.next;
        }
      } else {
        System.out.println("Empty Linked list");
      }
    }
    public void bubbleSort() {
      if (head != null) {
        Node current = null,
          new_head = null,
          move_node = null,
          prev = null;
        while (head != null) {
          prev = null;
          current = head;
          move_node = head;
          while (current != null) {
            if (current.next != null && current.next.data > move_node.data) {
              move_node = current.next;
              prev = current;
            }
            current = current.next;
          }
          if (move_node == head) {
            head = (head).next;
          }
          if (prev != null) {
            prev.next = move_node.next;
          }
          move_node.next = new_head;
          new_head = move_node;
        }
        head = new_head;
      } else {
        System.out.println("Empty Linked list");
      }
    }
    public static void main(String[] args) {
      bubble obj = new bubble();
      //insert element of linked list
      obj.insert(7);
      obj.insert(2);
      obj.insert(6);
      obj.insert(8);
      obj.insert(5);
      obj.insert(15);
      System.out.print("Before sort : ");
      obj.display();
      obj.bubbleSort();
      System.out.print("\nAfter sort  : ");
      obj.display();
    }
  }