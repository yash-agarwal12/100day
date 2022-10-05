import java.util.*;
public class stringremove {
  static String solve(String str1, String str2) {
    StringBuffer ans = new StringBuffer();
    for (int i = 0; i < str1.length(); i++) {
      int flag = 0;
      for (int j = 0; j < str2.length(); j++) {
        if (str1.charAt(i) == str2.charAt(j)) {
          flag = 1;
        }
      }

      if (flag != 1)
        ans.append(str1.charAt(i));
    }
    return ans.toString();
  }

  public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the string 1:");
    String stri1 = sc.nextLine();
    System.out.println("Enter the string 2:");
    String stri2 = sc.nextLine();
    String str1=stri1.toLowerCase();
    String str2= stri2.toLowerCase();
    System.out.println("Final string 1:");
    System.out.println(solve(str1, str2));
  }
}
