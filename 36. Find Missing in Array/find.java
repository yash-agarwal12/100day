// A sorting based Java program to find missing
// elements from an array
/// input 1 4  5 6 7 
//low =1
//high =4
//output 2 3 

import java.util.Arrays;
import java.util.Scanner;


public class find {
	
	static void printMissing(int ar[], int low, int high)
	{
		Arrays.sort(ar);
	
		int index = ceilindex(ar, low, 0, ar.length - 1);
		int x = low;

	
		while (index < ar.length && x <= high) {
		
			if (ar[index] != x) {
				System.out.print(x + " ");
			}

			else
				index++;
			x++;
		}

	
		while (x <= high) {
			System.out.print(x + " ");
			x++;
		}
	}

	static int ceilindex(int ar[], int val, int low, int high)
	{

		if (val < ar[0])
			return 0;
		if (val > ar[ar.length - 1])
			return ar.length;

		int mid = (low + high) / 2;
		if (ar[mid] == val)
			return mid;
		if (ar[mid] < val) {
			if (mid + 1 < high && ar[mid + 1] >= val)
				return mid + 1;
			return ceilindex(ar, val, mid + 1, high);
		}
		else {
			if (mid - 1 >= low && ar[mid - 1] < val)
				return mid;
			return ceilindex(ar, val, low, mid - 1);
		}
	}

	public static void main(String[] args)
	
	{
	    Scanner sc =new Scanner(System.in);
	    System.out.println("enter the size of Arrays");
	    int n= sc.nextInt();
	    if(n<=0){
	        System.out.println("invalid input");
	        return;
	    }
	    	        System.out.println("enter the elements");

	    
    		int arr[] = new int[n];
    		for(int i=0;i<n;i++){
    		    arr[i]=sc.nextInt();
    		}
    		        System.out.println("enter the value of low");
	
		int low = sc.nextInt();
		    		        System.out.println("enter the value of high");

	int	high = sc.nextInt();
		printMissing(arr, low, high);
	}
}