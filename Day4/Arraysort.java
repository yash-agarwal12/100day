import java.util.Scanner;

public class arraysort 
{  
public static void main(String[] args)   
{  
    int a;
//creating an instance of an array  
int[] arr = new int[100];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements you want to enter");
int n=sc.nextInt();
System.out.println("Enter the elements in array:");
for (a=0;a<n;a++){
    arr[a]=sc.nextInt();
}   
System.out.println("Array elements after sorting:");  
//sorting logic  
for (int i = 0; i < n; i++)   
{  
for (int j = i + 1; j < n; j++)   
{  
int tmp = 0;  
if (arr[i] > arr[j])   
{  
tmp = arr[i];  
arr[i] = arr[j];  
arr[j] = tmp;  
}  
}  
//prints the sorted element of the array  
System.out.println(arr[i]);  
}  
}  
}  
