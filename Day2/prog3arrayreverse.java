import java.util.Scanner;

public class arrayreverse {
    public static void main(String args[]){
        Reverse r=new Reverse();
        r.reverse();

    } 
}
class Reverse{
    void reverse(){
        int i,j,n,temp;
        int a[]= new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        n=sc.nextInt();
        System.out.println("Enter the elements");
        
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0,j=n-1;i<j;i++,j--){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.println("Sorted Array");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}

