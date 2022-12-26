// Java program to make an array same to another
// using minimum number of swap
// input arr1 1 5 3 4 
//arr2 1 2 3 4 5 
//output no of swap 1
import java.io.*;
import java.util.*;


class swapmin
{

static int minSwapsToSort(int arr[], int n)
{

	ArrayList<ArrayList<Integer>> arrPos = new ArrayList<ArrayList<Integer>>();
	for (int i = 0; i < n; i++)
	{
	arrPos.add(new ArrayList<Integer>(Arrays.asList(arr[i],i)));
	}

	
	Collections.sort(arrPos, new Comparator<ArrayList<Integer>>() {
	@Override
	public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
		return o1.get(0).compareTo(o2.get(0));
	}			
	});


	boolean[] vis = new boolean[n];

	int ans = 0;

	for (int i = 0; i < n; i++)
	{

	if (vis[i] || arrPos.get(i).get(1) == i)
		continue;
	int cycle_size = 0;
	int j = i;
	while (!vis[j])
	{
		vis[j] = true;
		j = arrPos.get(j).get(1);
		cycle_size++;
	}
	ans += (cycle_size - 1);
	}
	return ans;
}

static int minSwapToMakeArraySame(int a[], int b[], int n)
{
	Map<Integer, Integer> mp
	= new HashMap<Integer, Integer>();

	for (int i = 0; i < n; i++)
	{
	mp.put(b[i], i);
	}


	for (int i = 0; i < n; i++)
	b[i] = mp.get(a[i]);


	return minSwapsToSort(b, n);
}
public static void main (String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int n=sc.nextInt();
	int a[] = new int[n];
	    System.out.println("enter the element of 1st array");
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }

	int b[] = new int[n];
	 System.out.println("enter the element of 2st array");
	    for(int i=0;i<n;i++){
	        b[i]=sc.nextInt();
	    }

	System.out.println("no of swap  "+ minSwapToMakeArraySame(a, b, n));
}
}