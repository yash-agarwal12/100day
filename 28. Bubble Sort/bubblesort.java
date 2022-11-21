import java.util.Arrays;
import java.util.Scanner;


class bubblesort {
  static void bubbleSort(int array[]) {
    int size = array.length;
    for (int i = 0; i < size - 1; i++)
      for (int j = 0; j < size - i - 1; j++)
        if (array[j] > array[j + 1]) {
          // Swap if the elements aren't in the right order
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }

  public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of element you want to enter in Array");
      int n=sc.nextInt();
      if(n<=0){
          System.out.println("invalid input");
      }
      else{
    int[] data = new int [n];
    System.out.println("enter the element");
    for(int i=0;i<n;i++){
        data[i]=sc.nextInt();
    }
    bubblesort.bubbleSort(data);
    
    System.out.println("Array sorted with bubble sort: ");
    System.out.println(Arrays.toString(data));
  }
  }
}