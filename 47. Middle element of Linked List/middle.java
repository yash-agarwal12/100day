class middle
{ 
    static Node head;
    private class Node 
    { 
        int data; 
        Node next;
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    static int count()
    {
        Node temp = head;
        int count = 0;
        while(temp != null)
        {
            ++ count;
            temp = temp.next;
        }
        return count;
    }
    void middle_element(int count) 
    { 
        int midd = count/2;
        Node temp = head;
        while(midd>0)
        {
            -- midd;
            temp = temp.next;
        }
        System.out.println("The middle element is " + temp.data ); 
    } 
    public void add(int data) 
    { 
        Node new_node = new Node(data);
        new_node.next = head; 
        head = new_node; 
    } 
    public void print_list() 
    { 
        Node temp = head; 
        while (temp != null) 
        { 
            System.out.print(temp.data+"->"); 
            temp = temp.next; 
        } 
        System.out.println("NULL"); 
    } 
    public static void main(String [] args) 
    { 
        middle list = new middle(); 
        for (int i=0; i<=10; i++) 
        { 
            list.add(i); 
            list.print_list(); 
            int count = count();
            list.middle_element(count); 
        } 
    } 
} 