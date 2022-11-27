import java.util.Scanner;
class subset {


	static boolean isSubset(int arr1[], int arr2[], int m,
							int n)
	{
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++)
				if (arr2[i] == arr1[j])
					break;

		
			if (j == m)
				return false;
		}

	
		return true;
	}

	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of first array");
	    int n=sc.nextInt();
	    	    System.out.println("enter the size of second array");
	    	    	    int m=sc.nextInt();

if(m<=0&&n<=0){
    System.out.println("invalid input");
    return;
}
	    
		int arr1[] = new int[n];
		int arr2[] = new int[m];
		    System.out.println("enter the elements in 1 st array");

		for(int i=0;i<n;i++){
		    arr1[i]=sc.nextInt();
		}
				    System.out.println("enter the elements in 2nd array");

		for(int i=0;i<m;i++){
		    arr2[i]=sc.nextInt();
		}
		if (isSubset(arr1, arr2, m, n))
			System.out.print("arr2[] is "
							+ "subset of arr1[] ");
		else
			System.out.print("arr2[] is "
							+ "not a subset of arr1[]");
	}
}