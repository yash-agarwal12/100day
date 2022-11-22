import java.util.Arrays;
import java.util.Scanner;

 
public class recursiveinsertion
{
    
    static void insertionSortRecursive(int arr[], int n)
    {
        if (n <= 1)
            return;
      
        insertionSortRecursive( arr, n-1 );
      
        
        int last = arr[n-1];
        int j = n-2;
      
        
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
     
    public static void main(String[] args)
    
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        
        int s=sc.nextInt();
        if(s<=-1){
            return;
        }
        System.out.println("enter the element");
        int arr[] = new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
      
        insertionSortRecursive(arr, arr.length);
        System.out.println("array after insertion Sort using Recursion");
         
        System.out.println(Arrays.toString(arr));
    }
}