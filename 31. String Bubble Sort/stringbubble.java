import java.util.Scanner;
class stringbubble
{

	static int MAX = 100;

	public static void sortStrings(String[] arr, int n)
	{
		String temp;

		for (int j = 0; j < n - 1; j++)
		{
			for (int i = j + 1; i < n; i++)
			{
				if (arr[j].compareTo(arr[i]) > 0)
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args)
	{
	    Scanner sc= new Scanner(System.in);
	    System.out.println("enter the size of array");
	    		int n = sc.nextInt();
	    		if(n<=0){
	    		    System.out.println("invalid input");
	    		}

		String arr[] = new String[n];
		System.out.println("enter the element in array");
		for(int i=0;i<n;i++){
		   arr[i]=sc.nextLine(); 
		}
		sortStrings(arr, n);
		System.out.println("Strings in sorted order are : ");
		for (int i = 0; i < n; i++)
			System.out.println("String " + (i + 1) + " is " + arr[i]);
	}
}
