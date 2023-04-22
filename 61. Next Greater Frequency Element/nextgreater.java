//Next Greater Frequency Element 
import java.util.Arrays; 
import java.util.Stack; 
  
public class nextgreater { 
  
    static void nextGreaterFreqElement(int arr[], int n) 
    { 
        Stack<Integer> s = new Stack<>(); 
        int[] res = new int[n]; 
        Arrays.fill(res, -1); 
  
        for (int i = 0; i < n; i++) { 
  
            while (!s.empty() && arr[s.peek()] < arr[i]) { 
                res[s.peek()] = arr[i]; 
                s.pop(); 
            } 
            s.push(i); 
        } 
  
        for (int i = 0; i < n; i++) 
            System.out.print(res[i] + " "); 
    } 
  
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 1, 2, 3, 4, 2, 1 }; 
        int n = arr.length; 
        nextGreaterFreqElement(arr, n); 
    } 
}