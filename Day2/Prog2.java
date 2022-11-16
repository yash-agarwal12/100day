import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int len,i;
        String rev="";
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        len=A.length();
        for(i=0;i<=len-1;i++){
            rev=A.charAt(i)+rev;
        }
        /* Enter your code here. Print output to STDOUT. */
        if(A.equals(rev)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        }
    }



