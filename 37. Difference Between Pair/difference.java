import java.util.Scanner;
 
class difference {
    static int findMinDiff(int[] arr, int n)
    {
        int diff = Integer.MAX_VALUE;
 
        
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (Math.abs((arr[i] - arr[j])) < diff)
                    diff = Math.abs((arr[i] - arr[j]));
 
        return diff;
    }
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("invalid input");
            return;
        }
        int arr[] = new int[n] ;
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        
 
        System.out.println("Minimum difference is "
                           + findMinDiff(arr, n));
    }
}