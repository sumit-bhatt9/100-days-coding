// 100 day challenge
// Day 2
// Question 4:Count frequency of each element in the array
// Problem statement: Given an array, we have found the number of occurrences of each element in the array.
import java.util.*;
class Occurrence
{
  public static void main(String args[])
  {
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
       arr[i]= sc.nextInt();
     }
     count(arr,n);
  }
    static void count(int a[], int n)
    {
      boolean visited[]= new boolean[n];
      for(int i=0;i<n;i++)
      {
         if(visited[i]==true)
         continue;
         int c=1;
         for(int j=i+1;j<n;j++)
      {
         if(a[j]==a[i])
         {
           visited[j]=true;
           c++;
          }
       }
       System.out.println(a[i] + " " + c);

      }

    }
}