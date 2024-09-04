// Question 6: Calculate Sum of the Elements of the Array
// Problem Statement: Given an array, we have to find the sum of all the elements in the array.
import java.util.Scanner;
public class Sum {
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       int sum=0;
       for(int i=0;i<n;i++)
       {
         arr[i]= sc.nextInt();
         sum+= arr[i];
       }
          System.out.println(sum);
    }
    
}
