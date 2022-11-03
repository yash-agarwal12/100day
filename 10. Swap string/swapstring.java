import java.util.*;
public class swapstring {
   public static void main(String[] args) {
      String str="" ;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the string");
     str=sc.nextLine();
     if(str.equals("")){
         System .out.print("String is empty");
     }
     else{
     
      String[] temp = str.split("\\s");
      String rev = "";
      for (int i = 0; i < temp.length; i++) {
         if (i == temp.length - 1)
         rev = temp[i] + rev;
         else
         rev = " " + temp[i] + rev;
      }
      System.out.println("The reversed string is: " + rev);
   }
   }
}
