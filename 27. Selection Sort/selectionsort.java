import java.util.*;
public class selectionsort {  
    public static void selection(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size array");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("invalid input");
        }
        else{
        int arr[] =new int[n];
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
          
        selection(arr);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
    }  
    }
} 