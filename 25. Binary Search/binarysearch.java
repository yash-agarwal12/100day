import java.util.Scanner;  
class binarysearch{  
 public static void binarySearch(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  
 public static void main(String args[]){ 
     Scanner sc= new Scanner(System.in);
          System.out.println("enter the number of Element you want to enter in array");

     int n= sc.nextInt();
     if(n<=0){
         System.out.println("invalid input");
     }
     else{
          int arr[]=new int[n];
System.out.println("enter the element in array");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt(); 
     }
        int key;
        System.out.println("enter the key element");
        key=sc.nextInt();
        int last=arr.length-1;  
        binarySearch(arr,0,last,key);     
 }  
 }
} 