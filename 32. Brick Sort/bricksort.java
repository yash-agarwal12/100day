import java.util.Scanner;

class bricksort
{
	public static void oddEvenSort(int arr[], int n)
	{
		boolean isSorted = false; 

		while (!isSorted)
		{
			isSorted = true;
			int temp =0;

			// Perform Bubble sort on odd indexed element
			for (int i=1; i<=n-2; i=i+2)
			{
				if (arr[i] > arr[i+1])
				{
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					isSorted = false;
				}
			}

			// Perform Bubble sort on even indexed element
			for (int i=0; i<=n-2; i=i+2)
			{
				if (arr[i] > arr[i+1])
				{
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					isSorted = false;
				}
			}
		}

		return;
	}
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of array");
	    
		int n =sc.nextInt();
		if(n<=0){
		    System.out.println("invalid input");
		    return ;
		}
		int arr[]=new int[n];
		System.out.println("enter the element");
		for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}

		oddEvenSort(arr, n);
		System.out.println("element after brick sort");
		for (int i=0; i < n; i++)
			System.out.print(arr[i] + " ");

		System.out.println(" ");
	}
}