//rotate elements by k to the right
import java.util.*;
public class RotateK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
       {
       arr[i]= sc.nextInt();
       }
       System.out.print("value of rotate: ");
       int d=sc.nextInt();
      
       rotate(arr, d);
       System.out.println("Rotated array:");
       for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");  // Print the rotated array
       }
    }
    static void reverse(int arr[],int start,int end)
    {
      while(start<end)
      {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
      }
       
    }
    static void rotate(int a[],int d)
    {
      int n=a.length;
      d=d%n;
       reverse(a,0,n-1);
       reverse(a, 0, d-1);
       reverse(a, d, n-1);
    }
}
