import java.util.*;

public class arraymaxmin {
    int max(int [] array) {
       int max = 0;
      
       for(int i=0; i<array.length; i++ ) {
          if(array[i]>max) {
             max = array[i];
          }
       }
       return max;
    }
    int min(int [] array) {
       int min = array[0];
      
       for(int i=0; i<array.length; i++ ) {
          if(array[i]<min) {
             min = array[i];
          }
       }
       return min;
    }
    public static void main(String args[]) {
        int a;
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements you want to enter");
int n=sc.nextInt();
int[] myArray = new int[n];
System.out.println("Enter the elements in array:");
for (a=0;a<n;a++){
    myArray[a]=sc.nextInt();
}   
       
       
       arraymaxmin m = new arraymaxmin();
       System.out.println("Maximum value in the array is::"+m.max(myArray));
       System.out.println("Minimum value in the array is::"+m.min(myArray));
    }
 }
