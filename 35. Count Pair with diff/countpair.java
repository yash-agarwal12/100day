
import java.util.*;
import java.io.*;

class countpair {

	static int countPairsWithDiffK(int arr[],
									int n, int k)
	{
		int count = 0;

		for (int i = 0; i < n; i++)
		{
		
			for (int j = i + 1; j < n; j++)
				if (arr[i] - arr[j] == k ||
					arr[j] - arr[i] == k)
					count++;
		}
		return count;
	}

	public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
	    System.out.println("enter the size of array");
	    int n=sc.nextInt();
	    if(n<=0){
	        System.out.println("invalid input");
	        return;
	    }
		int arr[] = new int[n];
		System.out.println("enter the element");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println("enter the value of k");
		int k = sc.nextInt();
		System.out.println("Count of pairs with given diff is "
						+ countPairsWithDiffK(arr, n, k));
	}
}