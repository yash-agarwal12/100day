import java.util.*;

public class stringsort {

    public static String sort(String str, int n) {
      char[] arr = str.toCharArray();
      
      for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
          if (arr[j] > arr[j + 1]) {
            char temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
      }
      String ans = new String(arr);
      return ans;
    }
  
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to sort: ");
      String str = sc.nextLine();
      int n = str.length();
      System.out.println("After sorting:");
      System.out.println(sort(str, n));
    }
  }
