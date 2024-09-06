import java.util.Scanner;

public class Rotateone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
       {
       arr[i]= sc.nextInt();
       }
       rotate(arr,n);
    }
    static void rotate(int a[],int n)
    {
        int temp=a[0];
        for(int i =1;i<n;i++)
        {
            a[i-1]=a[i];
        }
        a[n-1]=temp;
        for(int i=0;i<n;i++)
        {
        System.out.print(a[i]);
        }
    }
}
