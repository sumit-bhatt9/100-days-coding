// 100 day challenge
// Day 3
// Question 5: Rearrange array in increasing-decreasing order

// Problem Statement: Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order
import java.util.*;
class Rearrange
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
        re(arr,n);
        
  
   }
   static void re(int arr[],int n)
   {
      for(int i=0;i<n-1;i++)
      {
         for(int j=0;j<n-1-i;j++)
         {
         if(arr[j]>arr[j+1])
           {
              int temp= arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
           }
        } 
      }
      for (int i = 0; i < n / 2; i++) 
      {
        System.out.print(arr[i] + " ");
      }
      for (int i = n - 1; i >= n / 2; i--) 
      {
        System.out.print(arr[i] + " ");
      }
   }
  


}


