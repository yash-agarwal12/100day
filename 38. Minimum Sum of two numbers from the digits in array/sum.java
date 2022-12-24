import java.util.Arrays;
import java.util.Scanner;

class sum {

	static int solve(int arr[], int N)
	{

		Arrays.sort(arr);

		int a = 0, b = 0;
		for (int i = 0; i < N; i++) {

			if (i % 2 != 0)
				a = a * 10 + arr[i];
			else
				b = b * 10 + arr[i];
		}

		return a + b;
	}

	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the size of Arrays");
	    int n=sc.nextInt();
	    if(n<=0){
	        	    System.out.println("invalid input");
	        	    return;

	    }
		int arr[] = new int[n];
	    System.out.println("enter the elements");
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }

		System.out.print("Sum is " + solve(arr, n));
	}
}
