import java.util.*;

class ele {
int count, index, val;

}
class mycomp implements Comparator<ele> {
public int compare(ele a, ele b)
{
	return (a.val - b.val);
}
}


class mycomp2 implements Comparator<ele> {
public int compare(ele a, ele b)
{
	if (a.count != b.count)
	return (a.count - b.count);
	return (b.index - a.index);
}
}

class frequencysort {

static void sortByFrequency(int[] arr, int n)
{
	ArrayList<ele> element = new ArrayList<ele>();
	for (int i = 0; i < n; i++) {

	element.add(new ele());
	element.get(i).index = i;

	element.get(i).count = 0;

	
	element.get(i).val = arr[i];
	}


	Collections.sort(element, new mycomp());

	element.get(0).count = 1;

	for (int i = 1; i < n; i++) {

	if (element.get(i).val == element.get(i - 1).val) {
		element.get(i).count += element.get(i - 1).count + 1;

	
		element.get(i - 1).count = -1;

	
		element.get(i).index = element.get(i - 1).index;
	}

	else
		element.get(i).count = 1;
	}


	Collections.sort(element, new mycomp2());
	for (int i = n - 1, index = 0; i >= 0; i--){
	if (element.get(i).count != -1)
	{
		for (int j = 0; j < element.get(i).count;j++)
		arr[index++] = element.get(i).val;
	}
	}
}

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int n=sc.nextInt();
    if(n<=0){
        System.out.println("invalid input");
        return;
    }
	int[] arr =new int[n];
	System.out.println("enter the element");
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}

	// Function call
	sortByFrequency(arr,	 n);

	for (int i = 0; i < n; i++)
	System.out.print(arr[i] + " ");
}
}