//Delete middle element of a stack java code 


public class deletemiddle {
 
    static class Stack {
        int top;
        int arr[] = new int[1000];
 
        Stack()
        {
            top = -1;
        }
 
        // push
        void push(int x)
        {
            arr[++top] = x;
        }
 
        // pop
        int pop()
        {
            return arr[top--];
        }
 
        // peek
        int peek()
        {
            return arr[top];
        }
 
        // isEmpty
        boolean isEmpty()
        {
            return top == -1;
        }
 
        // delete middle element
        int deleteMiddle()
        {
            int x = 0;
            int n = (top + 1) / 2;
            if (top % 2 == 0) {
                x = arr[n];
                for (int i = n; i < top; i++) {
                    arr[i] = arr[i + 1];
                }
            }
            else {
                x = arr[n];
                for (int i = n; i < top; i++) {
                    arr[i] = arr[i + 1];
                }
            }
            top--;
            return x;
        }
    }
 
    // Driver code
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(4);
        s.push(5);
        s.push(6);
 
        System.out.println("Element deleted from Stack : " + s.deleteMiddle());
    }
}