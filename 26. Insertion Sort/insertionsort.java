import java.util.Scanner;
public class insertionsort {
	
	void sortArray(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int current = arr[i];
			int j = i - 1;
            
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = current;
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		if(n<=0){
		    System.out.println("invalid input");
		}
		else{
		int arr[]=new int[n];
		System.out.println("enter the element");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		

		insertionsort arrayOfNumbers = new insertionsort();
		arrayOfNumbers.sortArray(arr);
		System.out.println("after sorting element are");

		printArray(arr);
        
	}
} 
}