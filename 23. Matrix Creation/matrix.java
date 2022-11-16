import java.util.Scanner;  
public class matrix {  
public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
int n=0,m=0;
System.out.println("enter the number of rows");
                        m=sc.nextInt();
                        System.out.println("enter the number of column");


            n=sc.nextInt(); 
if(n<=0||m<=0){
    System.out.println("enter the valid input");

}
       else{     

    int[][] arr = new int[m][n];  
    for (int i =0;i<m;i++)  
    {  
        for(int j=0;j<n;j++)  
        {  
            System.out.print("Enter Element");  
            arr[i][j]=sc.nextInt();  
            System.out.println();  
        }  
    }  
    System.out.println("Printing Elements...");  
    for(int i=0;i<m;i++)  
    {   
        System.out.println();  
        for(int j=0;j<n;j++)  
        {  
            System.out.print(arr[i][j]+"\t");  
        }  
    }  
}  
}}