public class hanoi {
 
    public static int N;
     static Stack<Integer>[] tower = new Stack[4]; 
 
    public static void main(String[] args) {
        tower[1] = new Stack<Integer>();
        tower[2] = new Stack<Integer>();
        tower[3] = new Stack<Integer>();
        N = 5;
        tohIterative(N);
    }
 
    public static void tohIterative(int n)
    {
        int i;
        int disc;
        int src = 1;
        int dest = 3;
        int temp = 2;
        if (n % 2 == 0)
        {
            int temp1 = dest;
            dest = temp;
            temp = temp1;
        }
        for (i = n; i >= 1; i--)
            tower[src].push(i);
        for (i = 1; i <= Math.pow(2, n) - 1; i++)
        {
            if (i % 3 == 1)
            {
                disc = tower[src].pop();
                tower[dest].push(disc);
            }
            else if (i % 3 == 2)
            {
                disc = tower[src].pop();
                tower[temp].push(disc);
            }
            else if (i % 3 == 0)
            {
                disc = tower[temp].pop();
                tower[dest].push(disc);
            }
        }
    }
}