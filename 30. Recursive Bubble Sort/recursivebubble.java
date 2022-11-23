import java.util.Arrays;
import java.util.Scanner;

public class recursivebubble
{
	static void bubbleSort(int arr[], int n)
	{
		if (n == 1)
			return;

		int count = 0;
		for (int i=0; i<n-1; i++)
			if (arr[i] > arr[i+1])
			{
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				count = count+1;
			}

		if (count == 0)
			return;

		bubbleSort(arr, n-1);
	}
	
	public static void main(String[] args)
	{
	    Scanner sc= new Scanner(System.in);
	    System.out.println("enter the size of array");
	    int n=sc.nextInt();
	    if(n<=0){
	        System.out.println("invalid input");
	        return;
	    }
    System.out.println("enter the elements");
		int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		
	
		bubbleSort(arr, arr.length);
		
		System.out.println("Sorted array : ");
		System.out.println(Arrays.toString(arr));
	}
}
